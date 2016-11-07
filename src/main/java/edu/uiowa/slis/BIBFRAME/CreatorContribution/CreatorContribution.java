package edu.uiowa.slis.BIBFRAME.CreatorContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class CreatorContribution extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CreatorContribution currentInstance = null;
	private static final Log log = LogFactory.getLog(CreatorContribution.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			CreatorContributionIterator theCreatorContributionIterator = (CreatorContributionIterator) findAncestorWithClass(this, CreatorContributionIterator.class);

			if (theCreatorContributionIterator != null) {
				subjectURI = theCreatorContributionIterator.getSubjectURI();
				label = theCreatorContributionIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Organization.OrganizationAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Organization.OrganizationAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Person.PersonAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Person.PersonAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Agent.AgentAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Agent.AgentAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Location.LocationAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Location.LocationAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Meeting.MeetingAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Meeting.MeetingAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Conference.ConferenceAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Conference.ConferenceAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Family.FamilyAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Family.FamilyAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (theCreatorContributionIterator == null && subjectURI == null) {
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
			log.error("Exception raised in CreatorContribution doStartTag", e);
			throw new JspTagException("Exception raised in CreatorContribution doStartTag");
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
			log.error("Exception raised in CreatorContribution doEndTag", e);
			throw new JspTagException("Exception raised in CreatorContribution doEndTag");
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
