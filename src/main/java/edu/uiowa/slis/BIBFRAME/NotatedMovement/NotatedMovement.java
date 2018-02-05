package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class NotatedMovement extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovement currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovement.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			NotatedMovementIterator theNotatedMovementIterator = (NotatedMovementIterator) findAncestorWithClass(this, NotatedMovementIterator.class);

			if (theNotatedMovementIterator != null) {
				subjectURI = theNotatedMovementIterator.getSubjectURI();
				label = theNotatedMovementIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator)this.getParent()).getHasTarget();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.RWO.RWOIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.RWO.RWOIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Topic.TopicIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Topic.TopicIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Concept.ConceptIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Concept.ConceptIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Authority.AuthorityIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Authority.AuthorityIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Agent.AgentIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Agent.AgentIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Person.PersonIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Person.PersonIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.LinguisticSystem.LinguisticSystemLanguageInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.LinguisticSystem.LinguisticSystemLanguageInverseIterator)this.getParent()).getLanguageInverse();
			}

			edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator theAnnotationHasTargetIterator = (edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator.class);

			if (subjectURI == null && theAnnotationHasTargetIterator != null) {
				subjectURI = theAnnotationHasTargetIterator.getHasTarget();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourceIsSubjectOfIterator theResourceIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourceIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourceIsSubjectOfIterator.class);

			if (subjectURI == null && theResourceIsSubjectOfIterator != null) {
				subjectURI = theResourceIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingIsSubjectOfIterator theThingIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingIsSubjectOfIterator.class);

			if (subjectURI == null && theThingIsSubjectOfIterator != null) {
				subjectURI = theThingIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.RWO.RWOIsSubjectOfIterator theRWOIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.RWO.RWOIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.RWO.RWOIsSubjectOfIterator.class);

			if (subjectURI == null && theRWOIsSubjectOfIterator != null) {
				subjectURI = theRWOIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Topic.TopicIsSubjectOfIterator theTopicIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Topic.TopicIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Topic.TopicIsSubjectOfIterator.class);

			if (subjectURI == null && theTopicIsSubjectOfIterator != null) {
				subjectURI = theTopicIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Concept.ConceptIsSubjectOfIterator theConceptIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Concept.ConceptIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Concept.ConceptIsSubjectOfIterator.class);

			if (subjectURI == null && theConceptIsSubjectOfIterator != null) {
				subjectURI = theConceptIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Authority.AuthorityIsSubjectOfIterator theAuthorityIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Authority.AuthorityIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Authority.AuthorityIsSubjectOfIterator.class);

			if (subjectURI == null && theAuthorityIsSubjectOfIterator != null) {
				subjectURI = theAuthorityIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Agent.AgentIsSubjectOfIterator theAgentIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Agent.AgentIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Agent.AgentIsSubjectOfIterator.class);

			if (subjectURI == null && theAgentIsSubjectOfIterator != null) {
				subjectURI = theAgentIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Person.PersonIsSubjectOfIterator thePersonIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Person.PersonIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Person.PersonIsSubjectOfIterator.class);

			if (subjectURI == null && thePersonIsSubjectOfIterator != null) {
				subjectURI = thePersonIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourceIsPartOfIterator theResourceIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourceIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourceIsPartOfIterator.class);

			if (subjectURI == null && theResourceIsPartOfIterator != null) {
				subjectURI = theResourceIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingIsPartOfIterator theThingIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingIsPartOfIterator.class);

			if (subjectURI == null && theThingIsPartOfIterator != null) {
				subjectURI = theThingIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator theWorkIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator.class);

			if (subjectURI == null && theWorkIsPartOfIterator != null) {
				subjectURI = theWorkIsPartOfIterator.getIsPartOf();
			}

			if (theNotatedMovementIterator == null && subjectURI == null) {
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
			log.error("Exception raised in NotatedMovement doStartTag", e);
			throw new JspTagException("Exception raised in NotatedMovement doStartTag");
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
			log.error("Exception raised in NotatedMovement doEndTag", e);
			throw new JspTagException("Exception raised in NotatedMovement doEndTag");
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
