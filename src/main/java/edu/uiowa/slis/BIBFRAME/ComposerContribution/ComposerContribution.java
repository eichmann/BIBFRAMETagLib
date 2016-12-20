package edu.uiowa.slis.BIBFRAME.ComposerContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ComposerContribution extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ComposerContribution currentInstance = null;
	private static final Log log = LogFactory.getLog(ComposerContribution.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ComposerContributionIterator theComposerContributionIterator = (ComposerContributionIterator) findAncestorWithClass(this, ComposerContributionIterator.class);

			if (theComposerContributionIterator != null) {
				subjectURI = theComposerContributionIterator.getSubjectURI();
				label = theComposerContributionIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Agent.AgentAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Agent.AgentAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.RWO.RWOAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.RWO.RWOAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Organization.OrganizationAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Organization.OrganizationAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Person.PersonAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Person.PersonAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Location.LocationAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Location.LocationAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (theComposerContributionIterator == null && subjectURI == null) {
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
			log.error("Exception raised in ComposerContribution doStartTag", e);
			throw new JspTagException("Exception raised in ComposerContribution doStartTag");
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
			log.error("Exception raised in ComposerContribution doEndTag", e);
			throw new JspTagException("Exception raised in ComposerContribution doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public  void setSubjectURI(String theSubjectURI) {
		subjectURI = theSubjectURI;
	}

	public  String getSubjectURI() {
		return subjectURI;
	}

	public  void setLabel(String theLabel) {
		label = theLabel;
	}

	public  String getLabel() {
		return label;
	}

}
