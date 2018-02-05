package edu.uiowa.slis.BIBFRAME.Class;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Class extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Class currentInstance = null;
	private static final Log log = LogFactory.getLog(Class.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ClassIterator theClassIterator = (ClassIterator) findAncestorWithClass(this, ClassIterator.class);

			if (theClassIterator != null) {
				subjectURI = theClassIterator.getSubjectURI();
				label = theClassIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceTheTypeIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceTheTypeIterator)this.getParent()).getTheType();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Restriction.RestrictionAllValuesFromIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Restriction.RestrictionAllValuesFromIterator)this.getParent()).getAllValuesFrom();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Class.ClassEquivalentClassIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Class.ClassEquivalentClassIterator)this.getParent()).getEquivalentClass();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Property.PropertyRangeIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Property.PropertyRangeIterator)this.getParent()).getRange();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Class.ClassSubClassOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Class.ClassSubClassOfIterator)this.getParent()).getSubClassOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Property.PropertyDomainIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Property.PropertyDomainIterator)this.getParent()).getDomain();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourceTheTypeIterator theResourceTheTypeIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourceTheTypeIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourceTheTypeIterator.class);

			if (subjectURI == null && theResourceTheTypeIterator != null) {
				subjectURI = theResourceTheTypeIterator.getTheType();
			}

			edu.uiowa.slis.BIBFRAME.Restriction.RestrictionAllValuesFromIterator theRestrictionAllValuesFromIterator = (edu.uiowa.slis.BIBFRAME.Restriction.RestrictionAllValuesFromIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Restriction.RestrictionAllValuesFromIterator.class);

			if (subjectURI == null && theRestrictionAllValuesFromIterator != null) {
				subjectURI = theRestrictionAllValuesFromIterator.getAllValuesFrom();
			}

			edu.uiowa.slis.BIBFRAME.Class.ClassEquivalentClassIterator theClassEquivalentClassIterator = (edu.uiowa.slis.BIBFRAME.Class.ClassEquivalentClassIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Class.ClassEquivalentClassIterator.class);

			if (subjectURI == null && theClassEquivalentClassIterator != null) {
				subjectURI = theClassEquivalentClassIterator.getEquivalentClass();
			}

			edu.uiowa.slis.BIBFRAME.Property.PropertyRangeIterator thePropertyRangeIterator = (edu.uiowa.slis.BIBFRAME.Property.PropertyRangeIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Property.PropertyRangeIterator.class);

			if (subjectURI == null && thePropertyRangeIterator != null) {
				subjectURI = thePropertyRangeIterator.getRange();
			}

			edu.uiowa.slis.BIBFRAME.Class.ClassSubClassOfIterator theClassSubClassOfIterator = (edu.uiowa.slis.BIBFRAME.Class.ClassSubClassOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Class.ClassSubClassOfIterator.class);

			if (subjectURI == null && theClassSubClassOfIterator != null) {
				subjectURI = theClassSubClassOfIterator.getSubClassOf();
			}

			edu.uiowa.slis.BIBFRAME.Property.PropertyDomainIterator thePropertyDomainIterator = (edu.uiowa.slis.BIBFRAME.Property.PropertyDomainIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Property.PropertyDomainIterator.class);

			if (subjectURI == null && thePropertyDomainIterator != null) {
				subjectURI = thePropertyDomainIterator.getDomain();
			}

			if (theClassIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Class doStartTag", e);
			throw new JspTagException("Exception raised in Class doStartTag");
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
			log.error("Exception raised in Class doEndTag", e);
			throw new JspTagException("Exception raised in Class doEndTag");
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
