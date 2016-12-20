package edu.uiowa.slis.BIBFRAME.PublisherProvision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class PublisherProvision extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PublisherProvision currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherProvision.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			PublisherProvisionIterator thePublisherProvisionIterator = (PublisherProvisionIterator) findAncestorWithClass(this, PublisherProvisionIterator.class);

			if (thePublisherProvisionIterator != null) {
				subjectURI = thePublisherProvisionIterator.getSubjectURI();
				label = thePublisherProvisionIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Location.LocationLocationOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Location.LocationLocationOfIterator)this.getParent()).getLocationOf();
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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Event.EventAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Event.EventAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Meeting.MeetingAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Meeting.MeetingAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographyAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographyAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Conference.ConferenceAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Conference.ConferenceAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Family.FamilyAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Family.FamilyAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Item.ItemAgentInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Item.ItemAgentInverseIterator)this.getParent()).getAgentInverse();
			}

			edu.uiowa.slis.BIBFRAME.Location.LocationLocationOfIterator theLocationLocationOfIterator = (edu.uiowa.slis.BIBFRAME.Location.LocationLocationOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Location.LocationLocationOfIterator.class);

			if (subjectURI == null && theLocationLocationOfIterator != null) {
				subjectURI = theLocationLocationOfIterator.getLocationOf();
			}

			if (thePublisherProvisionIterator == null && subjectURI == null) {
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
			log.error("Exception raised in PublisherProvision doStartTag", e);
			throw new JspTagException("Exception raised in PublisherProvision doStartTag");
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
			log.error("Exception raised in PublisherProvision doEndTag", e);
			throw new JspTagException("Exception raised in PublisherProvision doEndTag");
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
