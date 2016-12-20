package edu.uiowa.slis.BIBFRAME.LinguisticSystem;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class LinguisticSystem extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LinguisticSystem currentInstance = null;
	private static final Log log = LogFactory.getLog(LinguisticSystem.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			LinguisticSystemIterator theLinguisticSystemIterator = (LinguisticSystemIterator) findAncestorWithClass(this, LinguisticSystemIterator.class);

			if (theLinguisticSystemIterator != null) {
				subjectURI = theLinguisticSystemIterator.getSubjectURI();
				label = theLinguisticSystemIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Audio.AudioLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Audio.AudioLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographyLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographyLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Collection.CollectionLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Collection.CollectionLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Dataset.DatasetLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Dataset.DatasetLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.RWO.RWOLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.RWO.RWOLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Agent.AgentLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Agent.AgentLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Organization.OrganizationLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Organization.OrganizationLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Person.PersonLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Person.PersonLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Event.EventLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Event.EventLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Meeting.MeetingLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Meeting.MeetingLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Location.LocationLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Location.LocationLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Tactile.TactileLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Tactile.TactileLanguageIterator)this.getParent()).getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkLanguageIterator theWorkLanguageIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkLanguageIterator.class);

			if (subjectURI == null && theWorkLanguageIterator != null) {
				subjectURI = theWorkLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourceLanguageIterator theResourceLanguageIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourceLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourceLanguageIterator.class);

			if (subjectURI == null && theResourceLanguageIterator != null) {
				subjectURI = theResourceLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingLanguageIterator theThingLanguageIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingLanguageIterator.class);

			if (subjectURI == null && theThingLanguageIterator != null) {
				subjectURI = theThingLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextLanguageIterator theTextLanguageIterator = (edu.uiowa.slis.BIBFRAME.Text.TextLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextLanguageIterator.class);

			if (subjectURI == null && theTextLanguageIterator != null) {
				subjectURI = theTextLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceLanguageIterator theFiniteResourceLanguageIterator = (edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceLanguageIterator.class);

			if (subjectURI == null && theFiniteResourceLanguageIterator != null) {
				subjectURI = theFiniteResourceLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographLanguageIterator theMonographLanguageIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographLanguageIterator.class);

			if (subjectURI == null && theMonographLanguageIterator != null) {
				subjectURI = theMonographLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceLanguageIterator theInstanceLanguageIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceLanguageIterator.class);

			if (subjectURI == null && theInstanceLanguageIterator != null) {
				subjectURI = theInstanceLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceLanguageIterator theContinuingResourceLanguageIterator = (edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceLanguageIterator.class);

			if (subjectURI == null && theContinuingResourceLanguageIterator != null) {
				subjectURI = theContinuingResourceLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialLanguageIterator theSerialLanguageIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialLanguageIterator.class);

			if (subjectURI == null && theSerialLanguageIterator != null) {
				subjectURI = theSerialLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Audio.AudioLanguageIterator theAudioLanguageIterator = (edu.uiowa.slis.BIBFRAME.Audio.AudioLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Audio.AudioLanguageIterator.class);

			if (subjectURI == null && theAudioLanguageIterator != null) {
				subjectURI = theAudioLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageLanguageIterator theMovingImageLanguageIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageLanguageIterator.class);

			if (subjectURI == null && theMovingImageLanguageIterator != null) {
				subjectURI = theMovingImageLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographyLanguageIterator theCartographyLanguageIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographyLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographyLanguageIterator.class);

			if (subjectURI == null && theCartographyLanguageIterator != null) {
				subjectURI = theCartographyLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicLanguageIterator theNotatedMusicLanguageIterator = (edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicLanguageIterator.class);

			if (subjectURI == null && theNotatedMusicLanguageIterator != null) {
				subjectURI = theNotatedMusicLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Collection.CollectionLanguageIterator theCollectionLanguageIterator = (edu.uiowa.slis.BIBFRAME.Collection.CollectionLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Collection.CollectionLanguageIterator.class);

			if (subjectURI == null && theCollectionLanguageIterator != null) {
				subjectURI = theCollectionLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageLanguageIterator theStillImageLanguageIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageLanguageIterator.class);

			if (subjectURI == null && theStillImageLanguageIterator != null) {
				subjectURI = theStillImageLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Dataset.DatasetLanguageIterator theDatasetLanguageIterator = (edu.uiowa.slis.BIBFRAME.Dataset.DatasetLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Dataset.DatasetLanguageIterator.class);

			if (subjectURI == null && theDatasetLanguageIterator != null) {
				subjectURI = theDatasetLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaLanguageIterator theMultimediaLanguageIterator = (edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaLanguageIterator.class);

			if (subjectURI == null && theMultimediaLanguageIterator != null) {
				subjectURI = theMultimediaLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceLanguageIterator theIntegratingResourceLanguageIterator = (edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceLanguageIterator.class);

			if (subjectURI == null && theIntegratingResourceLanguageIterator != null) {
				subjectURI = theIntegratingResourceLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.RWO.RWOLanguageIterator theRWOLanguageIterator = (edu.uiowa.slis.BIBFRAME.RWO.RWOLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.RWO.RWOLanguageIterator.class);

			if (subjectURI == null && theRWOLanguageIterator != null) {
				subjectURI = theRWOLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectLanguageIterator theThreeDimensionalObjectLanguageIterator = (edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectLanguageIterator.class);

			if (subjectURI == null && theThreeDimensionalObjectLanguageIterator != null) {
				subjectURI = theThreeDimensionalObjectLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Agent.AgentLanguageIterator theAgentLanguageIterator = (edu.uiowa.slis.BIBFRAME.Agent.AgentLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Agent.AgentLanguageIterator.class);

			if (subjectURI == null && theAgentLanguageIterator != null) {
				subjectURI = theAgentLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Organization.OrganizationLanguageIterator theOrganizationLanguageIterator = (edu.uiowa.slis.BIBFRAME.Organization.OrganizationLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Organization.OrganizationLanguageIterator.class);

			if (subjectURI == null && theOrganizationLanguageIterator != null) {
				subjectURI = theOrganizationLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Person.PersonLanguageIterator thePersonLanguageIterator = (edu.uiowa.slis.BIBFRAME.Person.PersonLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Person.PersonLanguageIterator.class);

			if (subjectURI == null && thePersonLanguageIterator != null) {
				subjectURI = thePersonLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementLanguageIterator theNotatedMovementLanguageIterator = (edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementLanguageIterator.class);

			if (subjectURI == null && theNotatedMovementLanguageIterator != null) {
				subjectURI = theNotatedMovementLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Event.EventLanguageIterator theEventLanguageIterator = (edu.uiowa.slis.BIBFRAME.Event.EventLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Event.EventLanguageIterator.class);

			if (subjectURI == null && theEventLanguageIterator != null) {
				subjectURI = theEventLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Meeting.MeetingLanguageIterator theMeetingLanguageIterator = (edu.uiowa.slis.BIBFRAME.Meeting.MeetingLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Meeting.MeetingLanguageIterator.class);

			if (subjectURI == null && theMeetingLanguageIterator != null) {
				subjectURI = theMeetingLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Location.LocationLanguageIterator theLocationLanguageIterator = (edu.uiowa.slis.BIBFRAME.Location.LocationLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Location.LocationLanguageIterator.class);

			if (subjectURI == null && theLocationLanguageIterator != null) {
				subjectURI = theLocationLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Tactile.TactileLanguageIterator theTactileLanguageIterator = (edu.uiowa.slis.BIBFRAME.Tactile.TactileLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Tactile.TactileLanguageIterator.class);

			if (subjectURI == null && theTactileLanguageIterator != null) {
				subjectURI = theTactileLanguageIterator.getLanguage();
			}

			if (theLinguisticSystemIterator == null && subjectURI == null) {
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
			log.error("Exception raised in LinguisticSystem doStartTag", e);
			throw new JspTagException("Exception raised in LinguisticSystem doStartTag");
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
			log.error("Exception raised in LinguisticSystem doEndTag", e);
			throw new JspTagException("Exception raised in LinguisticSystem doEndTag");
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
