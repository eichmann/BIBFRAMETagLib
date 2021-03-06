package edu.uiowa.slis.BIBFRAME.ConceptScheme;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ConceptScheme extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConceptScheme currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptScheme.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ConceptSchemeIterator theConceptSchemeIterator = (ConceptSchemeIterator) findAncestorWithClass(this, ConceptSchemeIterator.class);

			if (theConceptSchemeIterator != null) {
				subjectURI = theConceptSchemeIterator.getSubjectURI();
				label = theConceptSchemeIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceInSchemeIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceInSchemeIterator)this.getParent()).getInScheme();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NamedIndividual.NamedIndividualInSchemeIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NamedIndividual.NamedIndividualInSchemeIterator)this.getParent()).getInScheme();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingInSchemeIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingInSchemeIterator)this.getParent()).getInScheme();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Concept.ConceptInSchemeIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Concept.ConceptInSchemeIterator)this.getParent()).getInScheme();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Motivation.MotivationInSchemeIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Motivation.MotivationInSchemeIterator)this.getParent()).getInScheme();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourceInSchemeIterator theResourceInSchemeIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourceInSchemeIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourceInSchemeIterator.class);

			if (subjectURI == null && theResourceInSchemeIterator != null) {
				subjectURI = theResourceInSchemeIterator.getInScheme();
			}

			edu.uiowa.slis.BIBFRAME.NamedIndividual.NamedIndividualInSchemeIterator theNamedIndividualInSchemeIterator = (edu.uiowa.slis.BIBFRAME.NamedIndividual.NamedIndividualInSchemeIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NamedIndividual.NamedIndividualInSchemeIterator.class);

			if (subjectURI == null && theNamedIndividualInSchemeIterator != null) {
				subjectURI = theNamedIndividualInSchemeIterator.getInScheme();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingInSchemeIterator theThingInSchemeIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingInSchemeIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingInSchemeIterator.class);

			if (subjectURI == null && theThingInSchemeIterator != null) {
				subjectURI = theThingInSchemeIterator.getInScheme();
			}

			edu.uiowa.slis.BIBFRAME.Concept.ConceptInSchemeIterator theConceptInSchemeIterator = (edu.uiowa.slis.BIBFRAME.Concept.ConceptInSchemeIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Concept.ConceptInSchemeIterator.class);

			if (subjectURI == null && theConceptInSchemeIterator != null) {
				subjectURI = theConceptInSchemeIterator.getInScheme();
			}

			edu.uiowa.slis.BIBFRAME.Motivation.MotivationInSchemeIterator theMotivationInSchemeIterator = (edu.uiowa.slis.BIBFRAME.Motivation.MotivationInSchemeIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Motivation.MotivationInSchemeIterator.class);

			if (subjectURI == null && theMotivationInSchemeIterator != null) {
				subjectURI = theMotivationInSchemeIterator.getInScheme();
			}

			if (theConceptSchemeIterator == null && subjectURI == null) {
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
			log.error("Exception raised in ConceptScheme doStartTag", e);
			throw new JspTagException("Exception raised in ConceptScheme doStartTag");
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
			log.error("Exception raised in ConceptScheme doEndTag", e);
			throw new JspTagException("Exception raised in ConceptScheme doEndTag");
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
