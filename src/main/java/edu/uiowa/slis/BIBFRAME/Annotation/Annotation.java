package edu.uiowa.slis.BIBFRAME.Annotation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Annotation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Annotation currentInstance = null;
	private static final Log log = LogFactory.getLog(Annotation.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			AnnotationIterator theAnnotationIterator = (AnnotationIterator) findAncestorWithClass(this, AnnotationIterator.class);

			if (theAnnotationIterator != null) {
				subjectURI = theAnnotationIterator.getSubjectURI();
				label = theAnnotationIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Agent.AgentIsAnnotatorOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Agent.AgentIsAnnotatorOfIterator)this.getParent()).getIsAnnotatorOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceIsBodyOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceIsBodyOfIterator)this.getParent()).getIsBodyOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingIsBodyOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingIsBodyOfIterator)this.getParent()).getIsBodyOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Content.ContentIsBodyOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Content.ContentIsBodyOfIterator)this.getParent()).getIsBodyOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ContentAsText.ContentAsTextIsBodyOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ContentAsText.ContentAsTextIsBodyOfIterator)this.getParent()).getIsBodyOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Audio.AudioHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Audio.AudioHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Collection.CollectionHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Collection.CollectionHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.RWO.RWOHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.RWO.RWOHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Agent.AgentHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Agent.AgentHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Person.PersonHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Person.PersonHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Organization.OrganizationHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Organization.OrganizationHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Event.EventHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Event.EventHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Meeting.MeetingHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Meeting.MeetingHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Location.LocationHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Location.LocationHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Tactile.TactileHasAnnotationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Tactile.TactileHasAnnotationIterator)this.getParent()).getHasAnnotation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Motivation.MotivationMotivatedByInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Motivation.MotivationMotivatedByInverseIterator)this.getParent()).getMotivatedByInverse();
			}

			edu.uiowa.slis.BIBFRAME.Agent.AgentIsAnnotatorOfIterator theAgentIsAnnotatorOfIterator = (edu.uiowa.slis.BIBFRAME.Agent.AgentIsAnnotatorOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Agent.AgentIsAnnotatorOfIterator.class);

			if (subjectURI == null && theAgentIsAnnotatorOfIterator != null) {
				subjectURI = theAgentIsAnnotatorOfIterator.getIsAnnotatorOf();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourceIsBodyOfIterator theResourceIsBodyOfIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourceIsBodyOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourceIsBodyOfIterator.class);

			if (subjectURI == null && theResourceIsBodyOfIterator != null) {
				subjectURI = theResourceIsBodyOfIterator.getIsBodyOf();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingIsBodyOfIterator theThingIsBodyOfIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingIsBodyOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingIsBodyOfIterator.class);

			if (subjectURI == null && theThingIsBodyOfIterator != null) {
				subjectURI = theThingIsBodyOfIterator.getIsBodyOf();
			}

			edu.uiowa.slis.BIBFRAME.Content.ContentIsBodyOfIterator theContentIsBodyOfIterator = (edu.uiowa.slis.BIBFRAME.Content.ContentIsBodyOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Content.ContentIsBodyOfIterator.class);

			if (subjectURI == null && theContentIsBodyOfIterator != null) {
				subjectURI = theContentIsBodyOfIterator.getIsBodyOf();
			}

			edu.uiowa.slis.BIBFRAME.ContentAsText.ContentAsTextIsBodyOfIterator theContentAsTextIsBodyOfIterator = (edu.uiowa.slis.BIBFRAME.ContentAsText.ContentAsTextIsBodyOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ContentAsText.ContentAsTextIsBodyOfIterator.class);

			if (subjectURI == null && theContentAsTextIsBodyOfIterator != null) {
				subjectURI = theContentAsTextIsBodyOfIterator.getIsBodyOf();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourceHasAnnotationIterator theResourceHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourceHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourceHasAnnotationIterator.class);

			if (subjectURI == null && theResourceHasAnnotationIterator != null) {
				subjectURI = theResourceHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingHasAnnotationIterator theThingHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingHasAnnotationIterator.class);

			if (subjectURI == null && theThingHasAnnotationIterator != null) {
				subjectURI = theThingHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkHasAnnotationIterator theWorkHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkHasAnnotationIterator.class);

			if (subjectURI == null && theWorkHasAnnotationIterator != null) {
				subjectURI = theWorkHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextHasAnnotationIterator theTextHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.Text.TextHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextHasAnnotationIterator.class);

			if (subjectURI == null && theTextHasAnnotationIterator != null) {
				subjectURI = theTextHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceHasAnnotationIterator theFiniteResourceHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceHasAnnotationIterator.class);

			if (subjectURI == null && theFiniteResourceHasAnnotationIterator != null) {
				subjectURI = theFiniteResourceHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographHasAnnotationIterator theMonographHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographHasAnnotationIterator.class);

			if (subjectURI == null && theMonographHasAnnotationIterator != null) {
				subjectURI = theMonographHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceHasAnnotationIterator theInstanceHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceHasAnnotationIterator.class);

			if (subjectURI == null && theInstanceHasAnnotationIterator != null) {
				subjectURI = theInstanceHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceHasAnnotationIterator theContinuingResourceHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceHasAnnotationIterator.class);

			if (subjectURI == null && theContinuingResourceHasAnnotationIterator != null) {
				subjectURI = theContinuingResourceHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialHasAnnotationIterator theSerialHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialHasAnnotationIterator.class);

			if (subjectURI == null && theSerialHasAnnotationIterator != null) {
				subjectURI = theSerialHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.Audio.AudioHasAnnotationIterator theAudioHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.Audio.AudioHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Audio.AudioHasAnnotationIterator.class);

			if (subjectURI == null && theAudioHasAnnotationIterator != null) {
				subjectURI = theAudioHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasAnnotationIterator theMovingImageHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasAnnotationIterator.class);

			if (subjectURI == null && theMovingImageHasAnnotationIterator != null) {
				subjectURI = theMovingImageHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasAnnotationIterator theNotatedMusicHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasAnnotationIterator.class);

			if (subjectURI == null && theNotatedMusicHasAnnotationIterator != null) {
				subjectURI = theNotatedMusicHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasAnnotationIterator theCartographyHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasAnnotationIterator.class);

			if (subjectURI == null && theCartographyHasAnnotationIterator != null) {
				subjectURI = theCartographyHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.Collection.CollectionHasAnnotationIterator theCollectionHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.Collection.CollectionHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Collection.CollectionHasAnnotationIterator.class);

			if (subjectURI == null && theCollectionHasAnnotationIterator != null) {
				subjectURI = theCollectionHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasAnnotationIterator theStillImageHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasAnnotationIterator.class);

			if (subjectURI == null && theStillImageHasAnnotationIterator != null) {
				subjectURI = theStillImageHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.RWO.RWOHasAnnotationIterator theRWOHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.RWO.RWOHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.RWO.RWOHasAnnotationIterator.class);

			if (subjectURI == null && theRWOHasAnnotationIterator != null) {
				subjectURI = theRWOHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasAnnotationIterator theDatasetHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasAnnotationIterator.class);

			if (subjectURI == null && theDatasetHasAnnotationIterator != null) {
				subjectURI = theDatasetHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasAnnotationIterator theMultimediaHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasAnnotationIterator.class);

			if (subjectURI == null && theMultimediaHasAnnotationIterator != null) {
				subjectURI = theMultimediaHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.Agent.AgentHasAnnotationIterator theAgentHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.Agent.AgentHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Agent.AgentHasAnnotationIterator.class);

			if (subjectURI == null && theAgentHasAnnotationIterator != null) {
				subjectURI = theAgentHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.Person.PersonHasAnnotationIterator thePersonHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.Person.PersonHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Person.PersonHasAnnotationIterator.class);

			if (subjectURI == null && thePersonHasAnnotationIterator != null) {
				subjectURI = thePersonHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceHasAnnotationIterator theIntegratingResourceHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceHasAnnotationIterator.class);

			if (subjectURI == null && theIntegratingResourceHasAnnotationIterator != null) {
				subjectURI = theIntegratingResourceHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectHasAnnotationIterator theThreeDimensionalObjectHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectHasAnnotationIterator.class);

			if (subjectURI == null && theThreeDimensionalObjectHasAnnotationIterator != null) {
				subjectURI = theThreeDimensionalObjectHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.Organization.OrganizationHasAnnotationIterator theOrganizationHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.Organization.OrganizationHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Organization.OrganizationHasAnnotationIterator.class);

			if (subjectURI == null && theOrganizationHasAnnotationIterator != null) {
				subjectURI = theOrganizationHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.Event.EventHasAnnotationIterator theEventHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.Event.EventHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Event.EventHasAnnotationIterator.class);

			if (subjectURI == null && theEventHasAnnotationIterator != null) {
				subjectURI = theEventHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.Meeting.MeetingHasAnnotationIterator theMeetingHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.Meeting.MeetingHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Meeting.MeetingHasAnnotationIterator.class);

			if (subjectURI == null && theMeetingHasAnnotationIterator != null) {
				subjectURI = theMeetingHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.Location.LocationHasAnnotationIterator theLocationHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.Location.LocationHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Location.LocationHasAnnotationIterator.class);

			if (subjectURI == null && theLocationHasAnnotationIterator != null) {
				subjectURI = theLocationHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementHasAnnotationIterator theNotatedMovementHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementHasAnnotationIterator.class);

			if (subjectURI == null && theNotatedMovementHasAnnotationIterator != null) {
				subjectURI = theNotatedMovementHasAnnotationIterator.getHasAnnotation();
			}

			edu.uiowa.slis.BIBFRAME.Tactile.TactileHasAnnotationIterator theTactileHasAnnotationIterator = (edu.uiowa.slis.BIBFRAME.Tactile.TactileHasAnnotationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Tactile.TactileHasAnnotationIterator.class);

			if (subjectURI == null && theTactileHasAnnotationIterator != null) {
				subjectURI = theTactileHasAnnotationIterator.getHasAnnotation();
			}

			if (theAnnotationIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Annotation doStartTag", e);
			throw new JspTagException("Exception raised in Annotation doStartTag");
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
			log.error("Exception raised in Annotation doEndTag", e);
			throw new JspTagException("Exception raised in Annotation doEndTag");
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
