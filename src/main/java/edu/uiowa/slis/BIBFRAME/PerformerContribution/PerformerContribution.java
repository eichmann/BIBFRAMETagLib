package edu.uiowa.slis.BIBFRAME.PerformerContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class PerformerContribution extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PerformerContribution currentInstance = null;
	private static final Log log = LogFactory.getLog(PerformerContribution.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			PerformerContributionIterator thePerformerContributionIterator = (PerformerContributionIterator) findAncestorWithClass(this, PerformerContributionIterator.class);

			if (thePerformerContributionIterator != null) {
				subjectURI = thePerformerContributionIterator.getSubjectURI();
				label = thePerformerContributionIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.RWO.RWOAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.RWO.RWOAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Person.PersonAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Person.PersonAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Organization.OrganizationAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Organization.OrganizationAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Location.LocationAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Location.LocationAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Meeting.MeetingAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Meeting.MeetingAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Agent.AgentAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Agent.AgentAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Conference.ConferenceAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Conference.ConferenceAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Family.FamilyAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Family.FamilyAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (thePerformerContributionIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?rdfValue  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in PerformerContribution doStartTag", e);
			throw new JspTagException("Exception raised in PerformerContribution doStartTag");
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
			log.error("Exception raised in PerformerContribution doEndTag", e);
			throw new JspTagException("Exception raised in PerformerContribution doEndTag");
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
