package edu.uiowa.slis.BIBFRAME.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Concept extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Concept currentInstance = null;
	private static final Log log = LogFactory.getLog(Concept.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ConceptIterator theConceptIterator = (ConceptIterator) findAncestorWithClass(this, ConceptIterator.class);

			if (theConceptIterator != null) {
				subjectURI = theConceptIterator.getSubjectURI();
				label = theConceptIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Concept.ConceptSemanticRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Concept.ConceptSemanticRelationIterator)this.getParent()).getSemanticRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ConceptScheme.ConceptSchemeHasTopConceptIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ConceptScheme.ConceptSchemeHasTopConceptIterator)this.getParent()).getHasTopConcept();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Collection.CollectionMemberIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Collection.CollectionMemberIterator)this.getParent()).getMember();
			}

			edu.uiowa.slis.BIBFRAME.Concept.ConceptSemanticRelationIterator theConceptSemanticRelationIterator = (edu.uiowa.slis.BIBFRAME.Concept.ConceptSemanticRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Concept.ConceptSemanticRelationIterator.class);

			if (subjectURI == null && theConceptSemanticRelationIterator != null) {
				subjectURI = theConceptSemanticRelationIterator.getSemanticRelation();
			}

			edu.uiowa.slis.BIBFRAME.ConceptScheme.ConceptSchemeHasTopConceptIterator theConceptSchemeHasTopConceptIterator = (edu.uiowa.slis.BIBFRAME.ConceptScheme.ConceptSchemeHasTopConceptIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ConceptScheme.ConceptSchemeHasTopConceptIterator.class);

			if (subjectURI == null && theConceptSchemeHasTopConceptIterator != null) {
				subjectURI = theConceptSchemeHasTopConceptIterator.getHasTopConcept();
			}

			edu.uiowa.slis.BIBFRAME.Collection.CollectionMemberIterator theCollectionMemberIterator = (edu.uiowa.slis.BIBFRAME.Collection.CollectionMemberIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Collection.CollectionMemberIterator.class);

			if (subjectURI == null && theCollectionMemberIterator != null) {
				subjectURI = theCollectionMemberIterator.getMember();
			}

			if (theConceptIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?schemaName ?rdfValue  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Concept doStartTag", e);
			throw new JspTagException("Exception raised in Concept doStartTag");
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
			log.error("Exception raised in Concept doEndTag", e);
			throw new JspTagException("Exception raised in Concept doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String subjectURI) {
		this.subjectURI = subjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}