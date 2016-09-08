package edu.uiowa.slis.BIBFRAME.Identifier;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Identifier extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Identifier currentInstance = null;
	private static final Log log = LogFactory.getLog(Identifier.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			IdentifierIterator theIdentifierIterator = (IdentifierIterator) findAncestorWithClass(this, IdentifierIterator.class);

			if (theIdentifierIterator != null) {
				subjectURI = theIdentifierIterator.getSubjectURI();
				label = theIdentifierIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceIdentifiedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceIdentifiedByIterator)this.getParent()).getIdentifiedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Person.PersonIdentifiedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Person.PersonIdentifiedByIterator)this.getParent()).getIdentifiedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Organization.OrganizationIdentifiedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Organization.OrganizationIdentifiedByIterator)this.getParent()).getIdentifiedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Meeting.MeetingIdentifiedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Meeting.MeetingIdentifiedByIterator)this.getParent()).getIdentifiedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Conference.ConferenceIdentifiedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Conference.ConferenceIdentifiedByIterator)this.getParent()).getIdentifiedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Agent.AgentIdentifiedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Agent.AgentIdentifiedByIterator)this.getParent()).getIdentifiedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkIdentifiedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkIdentifiedByIterator)this.getParent()).getIdentifiedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextIdentifiedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextIdentifiedByIterator)this.getParent()).getIdentifiedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Electronic.ElectronicIdentifiedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Electronic.ElectronicIdentifiedByIterator)this.getParent()).getIdentifiedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographIdentifiedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographIdentifiedByIterator)this.getParent()).getIdentifiedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceIdentifiedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceIdentifiedByIterator)this.getParent()).getIdentifiedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialIdentifiedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialIdentifiedByIterator)this.getParent()).getIdentifiedBy();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceIdentifiedByIterator theInstanceIdentifiedByIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceIdentifiedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceIdentifiedByIterator.class);

			if (subjectURI == null && theInstanceIdentifiedByIterator != null) {
				subjectURI = theInstanceIdentifiedByIterator.getIdentifiedBy();
			}

			edu.uiowa.slis.BIBFRAME.Person.PersonIdentifiedByIterator thePersonIdentifiedByIterator = (edu.uiowa.slis.BIBFRAME.Person.PersonIdentifiedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Person.PersonIdentifiedByIterator.class);

			if (subjectURI == null && thePersonIdentifiedByIterator != null) {
				subjectURI = thePersonIdentifiedByIterator.getIdentifiedBy();
			}

			edu.uiowa.slis.BIBFRAME.Organization.OrganizationIdentifiedByIterator theOrganizationIdentifiedByIterator = (edu.uiowa.slis.BIBFRAME.Organization.OrganizationIdentifiedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Organization.OrganizationIdentifiedByIterator.class);

			if (subjectURI == null && theOrganizationIdentifiedByIterator != null) {
				subjectURI = theOrganizationIdentifiedByIterator.getIdentifiedBy();
			}

			edu.uiowa.slis.BIBFRAME.Meeting.MeetingIdentifiedByIterator theMeetingIdentifiedByIterator = (edu.uiowa.slis.BIBFRAME.Meeting.MeetingIdentifiedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Meeting.MeetingIdentifiedByIterator.class);

			if (subjectURI == null && theMeetingIdentifiedByIterator != null) {
				subjectURI = theMeetingIdentifiedByIterator.getIdentifiedBy();
			}

			edu.uiowa.slis.BIBFRAME.Conference.ConferenceIdentifiedByIterator theConferenceIdentifiedByIterator = (edu.uiowa.slis.BIBFRAME.Conference.ConferenceIdentifiedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Conference.ConferenceIdentifiedByIterator.class);

			if (subjectURI == null && theConferenceIdentifiedByIterator != null) {
				subjectURI = theConferenceIdentifiedByIterator.getIdentifiedBy();
			}

			edu.uiowa.slis.BIBFRAME.Agent.AgentIdentifiedByIterator theAgentIdentifiedByIterator = (edu.uiowa.slis.BIBFRAME.Agent.AgentIdentifiedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Agent.AgentIdentifiedByIterator.class);

			if (subjectURI == null && theAgentIdentifiedByIterator != null) {
				subjectURI = theAgentIdentifiedByIterator.getIdentifiedBy();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkIdentifiedByIterator theWorkIdentifiedByIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkIdentifiedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkIdentifiedByIterator.class);

			if (subjectURI == null && theWorkIdentifiedByIterator != null) {
				subjectURI = theWorkIdentifiedByIterator.getIdentifiedBy();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextIdentifiedByIterator theTextIdentifiedByIterator = (edu.uiowa.slis.BIBFRAME.Text.TextIdentifiedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextIdentifiedByIterator.class);

			if (subjectURI == null && theTextIdentifiedByIterator != null) {
				subjectURI = theTextIdentifiedByIterator.getIdentifiedBy();
			}

			edu.uiowa.slis.BIBFRAME.Electronic.ElectronicIdentifiedByIterator theElectronicIdentifiedByIterator = (edu.uiowa.slis.BIBFRAME.Electronic.ElectronicIdentifiedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Electronic.ElectronicIdentifiedByIterator.class);

			if (subjectURI == null && theElectronicIdentifiedByIterator != null) {
				subjectURI = theElectronicIdentifiedByIterator.getIdentifiedBy();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographIdentifiedByIterator theMonographIdentifiedByIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographIdentifiedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographIdentifiedByIterator.class);

			if (subjectURI == null && theMonographIdentifiedByIterator != null) {
				subjectURI = theMonographIdentifiedByIterator.getIdentifiedBy();
			}

			edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceIdentifiedByIterator theIntegratingResourceIdentifiedByIterator = (edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceIdentifiedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceIdentifiedByIterator.class);

			if (subjectURI == null && theIntegratingResourceIdentifiedByIterator != null) {
				subjectURI = theIntegratingResourceIdentifiedByIterator.getIdentifiedBy();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialIdentifiedByIterator theSerialIdentifiedByIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialIdentifiedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialIdentifiedByIterator.class);

			if (subjectURI == null && theSerialIdentifiedByIterator != null) {
				subjectURI = theSerialIdentifiedByIterator.getIdentifiedBy();
			}

			if (theIdentifierIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(Prefix_1_4
				+ " SELECT ?label  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Identifier doStartTag", e);
			throw new JspTagException("Exception raised in Identifier doStartTag");
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
			log.error("Exception raised in Identifier doEndTag", e);
			throw new JspTagException("Exception raised in Identifier doEndTag");
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
