package edu.uiowa.slis.BIBFRAME.Property;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Property extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Property currentInstance = null;
	private static final Log log = LogFactory.getLog(Property.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			PropertyIterator thePropertyIterator = (PropertyIterator) findAncestorWithClass(this, PropertyIterator.class);

			if (thePropertyIterator != null) {
				subjectURI = thePropertyIterator.getSubjectURI();
				label = thePropertyIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Restriction.RestrictionOnPropertyIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Restriction.RestrictionOnPropertyIterator)this.getParent()).getOnProperty();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Property.PropertyPropertyDisjointWithIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Property.PropertyPropertyDisjointWithIterator)this.getParent()).getPropertyDisjointWith();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Property.PropertyEquivalentPropertyIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Property.PropertyEquivalentPropertyIterator)this.getParent()).getEquivalentProperty();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Property.PropertySubPropertyOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Property.PropertySubPropertyOfIterator)this.getParent()).getSubPropertyOf();
			}

			edu.uiowa.slis.BIBFRAME.Restriction.RestrictionOnPropertyIterator theRestrictionOnPropertyIterator = (edu.uiowa.slis.BIBFRAME.Restriction.RestrictionOnPropertyIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Restriction.RestrictionOnPropertyIterator.class);

			if (subjectURI == null && theRestrictionOnPropertyIterator != null) {
				subjectURI = theRestrictionOnPropertyIterator.getOnProperty();
			}

			edu.uiowa.slis.BIBFRAME.Property.PropertyPropertyDisjointWithIterator thePropertyPropertyDisjointWithIterator = (edu.uiowa.slis.BIBFRAME.Property.PropertyPropertyDisjointWithIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Property.PropertyPropertyDisjointWithIterator.class);

			if (subjectURI == null && thePropertyPropertyDisjointWithIterator != null) {
				subjectURI = thePropertyPropertyDisjointWithIterator.getPropertyDisjointWith();
			}

			edu.uiowa.slis.BIBFRAME.Property.PropertyEquivalentPropertyIterator thePropertyEquivalentPropertyIterator = (edu.uiowa.slis.BIBFRAME.Property.PropertyEquivalentPropertyIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Property.PropertyEquivalentPropertyIterator.class);

			if (subjectURI == null && thePropertyEquivalentPropertyIterator != null) {
				subjectURI = thePropertyEquivalentPropertyIterator.getEquivalentProperty();
			}

			edu.uiowa.slis.BIBFRAME.Property.PropertySubPropertyOfIterator thePropertySubPropertyOfIterator = (edu.uiowa.slis.BIBFRAME.Property.PropertySubPropertyOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Property.PropertySubPropertyOfIterator.class);

			if (subjectURI == null && thePropertySubPropertyOfIterator != null) {
				subjectURI = thePropertySubPropertyOfIterator.getSubPropertyOf();
			}

			if (thePropertyIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?labelUS ?labelENG ?label ?labelANY ?foafName ?schemaName ?rdfValue  where {"
				+ "  OPTIONAL { SELECT ?labelUS  WHERE { <" + subjectURI + "> rdfs:label ?labelUS  FILTER (lang(?labelUS) = \"en-US\")}    LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelENG WHERE { <" + subjectURI + "> rdfs:label ?labelENG FILTER (langMatches(?labelENG,\"en\"))} LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?label    WHERE { <" + subjectURI + "> rdfs:label ?label    FILTER (lang(?label) = \"\")}           LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelANY WHERE { <" + subjectURI + "> rdfs:label ?labelANY FILTER (lang(?labelANY) != \"\")}       LIMIT 1 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?labelUS") == null ? null : sol.get("?labelUS").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelENG") == null ? null : sol.get("?labelENG").asLiteral().getString();
					if (label == null)
						label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelANY") == null ? null : sol.get("?labelANY").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Property doStartTag", e);
			throw new JspTagException("Exception raised in Property doStartTag");
		} finally {
			freeConnection();
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Property doEndTag", e);
			throw new JspTagException("Exception raised in Property doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String theSubjectURI) {
		subjectURI = theSubjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String theLabel) {
		label = theLabel;
	}

	public String getLabel() {
		return label;
	}

}
