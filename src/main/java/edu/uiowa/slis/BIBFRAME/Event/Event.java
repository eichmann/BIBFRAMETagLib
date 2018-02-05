package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Event extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Event currentInstance = null;
	private static final Log log = LogFactory.getLog(Event.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			EventIterator theEventIterator = (EventIterator) findAncestorWithClass(this, EventIterator.class);

			if (theEventIterator != null) {
				subjectURI = theEventIterator.getSubjectURI();
				label = theEventIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Dataset.DatasetSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Dataset.DatasetSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Dataset.DatasetRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Dataset.DatasetRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkAccompaniedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkAccompaniedByIterator)this.getParent()).getAccompaniedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceAccompaniedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceAccompaniedByIterator)this.getParent()).getAccompaniedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingAccompaniedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingAccompaniedByIterator)this.getParent()).getAccompaniedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextAccompaniedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextAccompaniedByIterator)this.getParent()).getAccompaniedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceAccompaniedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceAccompaniedByIterator)this.getParent()).getAccompaniedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographAccompaniedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographAccompaniedByIterator)this.getParent()).getAccompaniedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Contribution.ContributionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Contribution.ContributionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Provision.ProvisionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Provision.ProvisionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.PublisherProvision.PublisherProvisionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.PublisherProvision.PublisherProvisionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.CreatorContribution.CreatorContributionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.CreatorContribution.CreatorContributionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.AuthorContribution.AuthorContributionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.AuthorContribution.AuthorContributionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.PerformerContribution.PerformerContributionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.PerformerContribution.PerformerContributionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.EditorContribution.EditorContributionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.EditorContribution.EditorContributionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.DistributorProvision.DistributorProvisionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.DistributorProvision.DistributorProvisionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourcePrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourcePrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourcePrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourcePrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstancePrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstancePrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourcePrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourcePrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographyPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographyPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImagePrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImagePrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Agent.AgentPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Agent.AgentPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Organization.OrganizationPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Organization.OrganizationPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.RWO.RWOPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.RWO.RWOPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Person.PersonPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Person.PersonPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Location.LocationPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Location.LocationPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImagePrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImagePrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Event.EventPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Event.EventPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Meeting.MeetingPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Meeting.MeetingPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator)this.getParent()).getIdentifies();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Location.LocationLocationOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Location.LocationLocationOfIterator)this.getParent()).getLocationOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator)this.getParent()).getHasTarget();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographyFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographyFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.RWO.RWOFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.RWO.RWOFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Agent.AgentFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Agent.AgentFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Organization.OrganizationFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Organization.OrganizationFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Person.PersonFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Person.PersonFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Location.LocationFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Location.LocationFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Event.EventFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Event.EventFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Meeting.MeetingFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Meeting.MeetingFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Audio.AudioHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Audio.AudioHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator)this.getParent()).getHasPart();
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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Audio.AudioIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Audio.AudioIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographyIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographyIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.LinguisticSystem.LinguisticSystemLanguageInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.LinguisticSystem.LinguisticSystemLanguageInverseIterator)this.getParent()).getLanguageInverse();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkSubjectIterator theWorkSubjectIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkSubjectIterator.class);

			if (subjectURI == null && theWorkSubjectIterator != null) {
				subjectURI = theWorkSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourceSubjectIterator theResourceSubjectIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourceSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourceSubjectIterator.class);

			if (subjectURI == null && theResourceSubjectIterator != null) {
				subjectURI = theResourceSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingSubjectIterator theThingSubjectIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingSubjectIterator.class);

			if (subjectURI == null && theThingSubjectIterator != null) {
				subjectURI = theThingSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator theTextSubjectIterator = (edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator.class);

			if (subjectURI == null && theTextSubjectIterator != null) {
				subjectURI = theTextSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceSubjectIterator theFiniteResourceSubjectIterator = (edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceSubjectIterator.class);

			if (subjectURI == null && theFiniteResourceSubjectIterator != null) {
				subjectURI = theFiniteResourceSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator theMonographSubjectIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator.class);

			if (subjectURI == null && theMonographSubjectIterator != null) {
				subjectURI = theMonographSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceSubjectIterator theInstanceSubjectIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceSubjectIterator.class);

			if (subjectURI == null && theInstanceSubjectIterator != null) {
				subjectURI = theInstanceSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceSubjectIterator theContinuingResourceSubjectIterator = (edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceSubjectIterator.class);

			if (subjectURI == null && theContinuingResourceSubjectIterator != null) {
				subjectURI = theContinuingResourceSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator theSerialSubjectIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator.class);

			if (subjectURI == null && theSerialSubjectIterator != null) {
				subjectURI = theSerialSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator theAudioSubjectIterator = (edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator.class);

			if (subjectURI == null && theAudioSubjectIterator != null) {
				subjectURI = theAudioSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageSubjectIterator theMovingImageSubjectIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageSubjectIterator.class);

			if (subjectURI == null && theMovingImageSubjectIterator != null) {
				subjectURI = theMovingImageSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator theNotatedMusicSubjectIterator = (edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator.class);

			if (subjectURI == null && theNotatedMusicSubjectIterator != null) {
				subjectURI = theNotatedMusicSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator theCollectionSubjectIterator = (edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator.class);

			if (subjectURI == null && theCollectionSubjectIterator != null) {
				subjectURI = theCollectionSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator theCartographySubjectIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator.class);

			if (subjectURI == null && theCartographySubjectIterator != null) {
				subjectURI = theCartographySubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator theStillImageSubjectIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator.class);

			if (subjectURI == null && theStillImageSubjectIterator != null) {
				subjectURI = theStillImageSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Dataset.DatasetSubjectIterator theDatasetSubjectIterator = (edu.uiowa.slis.BIBFRAME.Dataset.DatasetSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Dataset.DatasetSubjectIterator.class);

			if (subjectURI == null && theDatasetSubjectIterator != null) {
				subjectURI = theDatasetSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaSubjectIterator theMultimediaSubjectIterator = (edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaSubjectIterator.class);

			if (subjectURI == null && theMultimediaSubjectIterator != null) {
				subjectURI = theMultimediaSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceSubjectIterator theIntegratingResourceSubjectIterator = (edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceSubjectIterator.class);

			if (subjectURI == null && theIntegratingResourceSubjectIterator != null) {
				subjectURI = theIntegratingResourceSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkRelationIterator theWorkRelationIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkRelationIterator.class);

			if (subjectURI == null && theWorkRelationIterator != null) {
				subjectURI = theWorkRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourceRelationIterator theResourceRelationIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourceRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourceRelationIterator.class);

			if (subjectURI == null && theResourceRelationIterator != null) {
				subjectURI = theResourceRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingRelationIterator theThingRelationIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingRelationIterator.class);

			if (subjectURI == null && theThingRelationIterator != null) {
				subjectURI = theThingRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceRelationIterator theFiniteResourceRelationIterator = (edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceRelationIterator.class);

			if (subjectURI == null && theFiniteResourceRelationIterator != null) {
				subjectURI = theFiniteResourceRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationIterator theMonographRelationIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationIterator.class);

			if (subjectURI == null && theMonographRelationIterator != null) {
				subjectURI = theMonographRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator theTextRelationIterator = (edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator.class);

			if (subjectURI == null && theTextRelationIterator != null) {
				subjectURI = theTextRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceRelationIterator theInstanceRelationIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceRelationIterator.class);

			if (subjectURI == null && theInstanceRelationIterator != null) {
				subjectURI = theInstanceRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceRelationIterator theContinuingResourceRelationIterator = (edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceRelationIterator.class);

			if (subjectURI == null && theContinuingResourceRelationIterator != null) {
				subjectURI = theContinuingResourceRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialRelationIterator theSerialRelationIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialRelationIterator.class);

			if (subjectURI == null && theSerialRelationIterator != null) {
				subjectURI = theSerialRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageRelationIterator theMovingImageRelationIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageRelationIterator.class);

			if (subjectURI == null && theMovingImageRelationIterator != null) {
				subjectURI = theMovingImageRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Dataset.DatasetRelationIterator theDatasetRelationIterator = (edu.uiowa.slis.BIBFRAME.Dataset.DatasetRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Dataset.DatasetRelationIterator.class);

			if (subjectURI == null && theDatasetRelationIterator != null) {
				subjectURI = theDatasetRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaRelationIterator theMultimediaRelationIterator = (edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaRelationIterator.class);

			if (subjectURI == null && theMultimediaRelationIterator != null) {
				subjectURI = theMultimediaRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkAccompaniedByIterator theWorkAccompaniedByIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkAccompaniedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkAccompaniedByIterator.class);

			if (subjectURI == null && theWorkAccompaniedByIterator != null) {
				subjectURI = theWorkAccompaniedByIterator.getAccompaniedBy();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourceAccompaniedByIterator theResourceAccompaniedByIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourceAccompaniedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourceAccompaniedByIterator.class);

			if (subjectURI == null && theResourceAccompaniedByIterator != null) {
				subjectURI = theResourceAccompaniedByIterator.getAccompaniedBy();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingAccompaniedByIterator theThingAccompaniedByIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingAccompaniedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingAccompaniedByIterator.class);

			if (subjectURI == null && theThingAccompaniedByIterator != null) {
				subjectURI = theThingAccompaniedByIterator.getAccompaniedBy();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextAccompaniedByIterator theTextAccompaniedByIterator = (edu.uiowa.slis.BIBFRAME.Text.TextAccompaniedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextAccompaniedByIterator.class);

			if (subjectURI == null && theTextAccompaniedByIterator != null) {
				subjectURI = theTextAccompaniedByIterator.getAccompaniedBy();
			}

			edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceAccompaniedByIterator theFiniteResourceAccompaniedByIterator = (edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceAccompaniedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceAccompaniedByIterator.class);

			if (subjectURI == null && theFiniteResourceAccompaniedByIterator != null) {
				subjectURI = theFiniteResourceAccompaniedByIterator.getAccompaniedBy();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographAccompaniedByIterator theMonographAccompaniedByIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographAccompaniedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographAccompaniedByIterator.class);

			if (subjectURI == null && theMonographAccompaniedByIterator != null) {
				subjectURI = theMonographAccompaniedByIterator.getAccompaniedBy();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourceAgentIterator theResourceAgentIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourceAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourceAgentIterator.class);

			if (subjectURI == null && theResourceAgentIterator != null) {
				subjectURI = theResourceAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingAgentIterator theThingAgentIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingAgentIterator.class);

			if (subjectURI == null && theThingAgentIterator != null) {
				subjectURI = theThingAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.Contribution.ContributionAgentIterator theContributionAgentIterator = (edu.uiowa.slis.BIBFRAME.Contribution.ContributionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Contribution.ContributionAgentIterator.class);

			if (subjectURI == null && theContributionAgentIterator != null) {
				subjectURI = theContributionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.Provision.ProvisionAgentIterator theProvisionAgentIterator = (edu.uiowa.slis.BIBFRAME.Provision.ProvisionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Provision.ProvisionAgentIterator.class);

			if (subjectURI == null && theProvisionAgentIterator != null) {
				subjectURI = theProvisionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.PublisherProvision.PublisherProvisionAgentIterator thePublisherProvisionAgentIterator = (edu.uiowa.slis.BIBFRAME.PublisherProvision.PublisherProvisionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.PublisherProvision.PublisherProvisionAgentIterator.class);

			if (subjectURI == null && thePublisherProvisionAgentIterator != null) {
				subjectURI = thePublisherProvisionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.CreatorContribution.CreatorContributionAgentIterator theCreatorContributionAgentIterator = (edu.uiowa.slis.BIBFRAME.CreatorContribution.CreatorContributionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.CreatorContribution.CreatorContributionAgentIterator.class);

			if (subjectURI == null && theCreatorContributionAgentIterator != null) {
				subjectURI = theCreatorContributionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.AuthorContribution.AuthorContributionAgentIterator theAuthorContributionAgentIterator = (edu.uiowa.slis.BIBFRAME.AuthorContribution.AuthorContributionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.AuthorContribution.AuthorContributionAgentIterator.class);

			if (subjectURI == null && theAuthorContributionAgentIterator != null) {
				subjectURI = theAuthorContributionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.PerformerContribution.PerformerContributionAgentIterator thePerformerContributionAgentIterator = (edu.uiowa.slis.BIBFRAME.PerformerContribution.PerformerContributionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.PerformerContribution.PerformerContributionAgentIterator.class);

			if (subjectURI == null && thePerformerContributionAgentIterator != null) {
				subjectURI = thePerformerContributionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.EditorContribution.EditorContributionAgentIterator theEditorContributionAgentIterator = (edu.uiowa.slis.BIBFRAME.EditorContribution.EditorContributionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.EditorContribution.EditorContributionAgentIterator.class);

			if (subjectURI == null && theEditorContributionAgentIterator != null) {
				subjectURI = theEditorContributionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAgentIterator theManufacturerProvisionAgentIterator = (edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAgentIterator.class);

			if (subjectURI == null && theManufacturerProvisionAgentIterator != null) {
				subjectURI = theManufacturerProvisionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.DistributorProvision.DistributorProvisionAgentIterator theDistributorProvisionAgentIterator = (edu.uiowa.slis.BIBFRAME.DistributorProvision.DistributorProvisionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.DistributorProvision.DistributorProvisionAgentIterator.class);

			if (subjectURI == null && theDistributorProvisionAgentIterator != null) {
				subjectURI = theDistributorProvisionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourcePrecedesIterator theResourcePrecedesIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourcePrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourcePrecedesIterator.class);

			if (subjectURI == null && theResourcePrecedesIterator != null) {
				subjectURI = theResourcePrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingPrecedesIterator theThingPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingPrecedesIterator.class);

			if (subjectURI == null && theThingPrecedesIterator != null) {
				subjectURI = theThingPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesIterator theWorkPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesIterator.class);

			if (subjectURI == null && theWorkPrecedesIterator != null) {
				subjectURI = theWorkPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextPrecedesIterator theTextPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Text.TextPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextPrecedesIterator.class);

			if (subjectURI == null && theTextPrecedesIterator != null) {
				subjectURI = theTextPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourcePrecedesIterator theContinuingResourcePrecedesIterator = (edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourcePrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourcePrecedesIterator.class);

			if (subjectURI == null && theContinuingResourcePrecedesIterator != null) {
				subjectURI = theContinuingResourcePrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialPrecedesIterator theSerialPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialPrecedesIterator.class);

			if (subjectURI == null && theSerialPrecedesIterator != null) {
				subjectURI = theSerialPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstancePrecedesIterator theInstancePrecedesIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstancePrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstancePrecedesIterator.class);

			if (subjectURI == null && theInstancePrecedesIterator != null) {
				subjectURI = theInstancePrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourcePrecedesIterator theFiniteResourcePrecedesIterator = (edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourcePrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourcePrecedesIterator.class);

			if (subjectURI == null && theFiniteResourcePrecedesIterator != null) {
				subjectURI = theFiniteResourcePrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographPrecedesIterator theMonographPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographPrecedesIterator.class);

			if (subjectURI == null && theMonographPrecedesIterator != null) {
				subjectURI = theMonographPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographyPrecedesIterator theCartographyPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographyPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographyPrecedesIterator.class);

			if (subjectURI == null && theCartographyPrecedesIterator != null) {
				subjectURI = theCartographyPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImagePrecedesIterator theStillImagePrecedesIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImagePrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImagePrecedesIterator.class);

			if (subjectURI == null && theStillImagePrecedesIterator != null) {
				subjectURI = theStillImagePrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Agent.AgentPrecedesIterator theAgentPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Agent.AgentPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Agent.AgentPrecedesIterator.class);

			if (subjectURI == null && theAgentPrecedesIterator != null) {
				subjectURI = theAgentPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Organization.OrganizationPrecedesIterator theOrganizationPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Organization.OrganizationPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Organization.OrganizationPrecedesIterator.class);

			if (subjectURI == null && theOrganizationPrecedesIterator != null) {
				subjectURI = theOrganizationPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.RWO.RWOPrecedesIterator theRWOPrecedesIterator = (edu.uiowa.slis.BIBFRAME.RWO.RWOPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.RWO.RWOPrecedesIterator.class);

			if (subjectURI == null && theRWOPrecedesIterator != null) {
				subjectURI = theRWOPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Person.PersonPrecedesIterator thePersonPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Person.PersonPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Person.PersonPrecedesIterator.class);

			if (subjectURI == null && thePersonPrecedesIterator != null) {
				subjectURI = thePersonPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Location.LocationPrecedesIterator theLocationPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Location.LocationPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Location.LocationPrecedesIterator.class);

			if (subjectURI == null && theLocationPrecedesIterator != null) {
				subjectURI = theLocationPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImagePrecedesIterator theMovingImagePrecedesIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImagePrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImagePrecedesIterator.class);

			if (subjectURI == null && theMovingImagePrecedesIterator != null) {
				subjectURI = theMovingImagePrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectPrecedesIterator theThreeDimensionalObjectPrecedesIterator = (edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectPrecedesIterator.class);

			if (subjectURI == null && theThreeDimensionalObjectPrecedesIterator != null) {
				subjectURI = theThreeDimensionalObjectPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Event.EventPrecedesIterator theEventPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Event.EventPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Event.EventPrecedesIterator.class);

			if (subjectURI == null && theEventPrecedesIterator != null) {
				subjectURI = theEventPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Meeting.MeetingPrecedesIterator theMeetingPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Meeting.MeetingPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Meeting.MeetingPrecedesIterator.class);

			if (subjectURI == null && theMeetingPrecedesIterator != null) {
				subjectURI = theMeetingPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator theIdentifierIdentifiesIterator = (edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator.class);

			if (subjectURI == null && theIdentifierIdentifiesIterator != null) {
				subjectURI = theIdentifierIdentifiesIterator.getIdentifies();
			}

			edu.uiowa.slis.BIBFRAME.Location.LocationLocationOfIterator theLocationLocationOfIterator = (edu.uiowa.slis.BIBFRAME.Location.LocationLocationOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Location.LocationLocationOfIterator.class);

			if (subjectURI == null && theLocationLocationOfIterator != null) {
				subjectURI = theLocationLocationOfIterator.getLocationOf();
			}

			edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator theAnnotationHasTargetIterator = (edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator.class);

			if (subjectURI == null && theAnnotationHasTargetIterator != null) {
				subjectURI = theAnnotationHasTargetIterator.getHasTarget();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourceFollowsIterator theResourceFollowsIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourceFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourceFollowsIterator.class);

			if (subjectURI == null && theResourceFollowsIterator != null) {
				subjectURI = theResourceFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingFollowsIterator theThingFollowsIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingFollowsIterator.class);

			if (subjectURI == null && theThingFollowsIterator != null) {
				subjectURI = theThingFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkFollowsIterator theWorkFollowsIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkFollowsIterator.class);

			if (subjectURI == null && theWorkFollowsIterator != null) {
				subjectURI = theWorkFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextFollowsIterator theTextFollowsIterator = (edu.uiowa.slis.BIBFRAME.Text.TextFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextFollowsIterator.class);

			if (subjectURI == null && theTextFollowsIterator != null) {
				subjectURI = theTextFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceFollowsIterator theFiniteResourceFollowsIterator = (edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceFollowsIterator.class);

			if (subjectURI == null && theFiniteResourceFollowsIterator != null) {
				subjectURI = theFiniteResourceFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographFollowsIterator theMonographFollowsIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographFollowsIterator.class);

			if (subjectURI == null && theMonographFollowsIterator != null) {
				subjectURI = theMonographFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceFollowsIterator theContinuingResourceFollowsIterator = (edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceFollowsIterator.class);

			if (subjectURI == null && theContinuingResourceFollowsIterator != null) {
				subjectURI = theContinuingResourceFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialFollowsIterator theSerialFollowsIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialFollowsIterator.class);

			if (subjectURI == null && theSerialFollowsIterator != null) {
				subjectURI = theSerialFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceFollowsIterator theInstanceFollowsIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceFollowsIterator.class);

			if (subjectURI == null && theInstanceFollowsIterator != null) {
				subjectURI = theInstanceFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageFollowsIterator theMovingImageFollowsIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageFollowsIterator.class);

			if (subjectURI == null && theMovingImageFollowsIterator != null) {
				subjectURI = theMovingImageFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographyFollowsIterator theCartographyFollowsIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographyFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographyFollowsIterator.class);

			if (subjectURI == null && theCartographyFollowsIterator != null) {
				subjectURI = theCartographyFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.RWO.RWOFollowsIterator theRWOFollowsIterator = (edu.uiowa.slis.BIBFRAME.RWO.RWOFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.RWO.RWOFollowsIterator.class);

			if (subjectURI == null && theRWOFollowsIterator != null) {
				subjectURI = theRWOFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageFollowsIterator theStillImageFollowsIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageFollowsIterator.class);

			if (subjectURI == null && theStillImageFollowsIterator != null) {
				subjectURI = theStillImageFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Agent.AgentFollowsIterator theAgentFollowsIterator = (edu.uiowa.slis.BIBFRAME.Agent.AgentFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Agent.AgentFollowsIterator.class);

			if (subjectURI == null && theAgentFollowsIterator != null) {
				subjectURI = theAgentFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Organization.OrganizationFollowsIterator theOrganizationFollowsIterator = (edu.uiowa.slis.BIBFRAME.Organization.OrganizationFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Organization.OrganizationFollowsIterator.class);

			if (subjectURI == null && theOrganizationFollowsIterator != null) {
				subjectURI = theOrganizationFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Person.PersonFollowsIterator thePersonFollowsIterator = (edu.uiowa.slis.BIBFRAME.Person.PersonFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Person.PersonFollowsIterator.class);

			if (subjectURI == null && thePersonFollowsIterator != null) {
				subjectURI = thePersonFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Location.LocationFollowsIterator theLocationFollowsIterator = (edu.uiowa.slis.BIBFRAME.Location.LocationFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Location.LocationFollowsIterator.class);

			if (subjectURI == null && theLocationFollowsIterator != null) {
				subjectURI = theLocationFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectFollowsIterator theThreeDimensionalObjectFollowsIterator = (edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectFollowsIterator.class);

			if (subjectURI == null && theThreeDimensionalObjectFollowsIterator != null) {
				subjectURI = theThreeDimensionalObjectFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Event.EventFollowsIterator theEventFollowsIterator = (edu.uiowa.slis.BIBFRAME.Event.EventFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Event.EventFollowsIterator.class);

			if (subjectURI == null && theEventFollowsIterator != null) {
				subjectURI = theEventFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Meeting.MeetingFollowsIterator theMeetingFollowsIterator = (edu.uiowa.slis.BIBFRAME.Meeting.MeetingFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Meeting.MeetingFollowsIterator.class);

			if (subjectURI == null && theMeetingFollowsIterator != null) {
				subjectURI = theMeetingFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourceHasPartIterator theResourceHasPartIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourceHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourceHasPartIterator.class);

			if (subjectURI == null && theResourceHasPartIterator != null) {
				subjectURI = theResourceHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingHasPartIterator theThingHasPartIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingHasPartIterator.class);

			if (subjectURI == null && theThingHasPartIterator != null) {
				subjectURI = theThingHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkHasPartIterator theWorkHasPartIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkHasPartIterator.class);

			if (subjectURI == null && theWorkHasPartIterator != null) {
				subjectURI = theWorkHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceHasPartIterator theFiniteResourceHasPartIterator = (edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceHasPartIterator.class);

			if (subjectURI == null && theFiniteResourceHasPartIterator != null) {
				subjectURI = theFiniteResourceHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographHasPartIterator theMonographHasPartIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographHasPartIterator.class);

			if (subjectURI == null && theMonographHasPartIterator != null) {
				subjectURI = theMonographHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextHasPartIterator theTextHasPartIterator = (edu.uiowa.slis.BIBFRAME.Text.TextHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextHasPartIterator.class);

			if (subjectURI == null && theTextHasPartIterator != null) {
				subjectURI = theTextHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Audio.AudioHasPartIterator theAudioHasPartIterator = (edu.uiowa.slis.BIBFRAME.Audio.AudioHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Audio.AudioHasPartIterator.class);

			if (subjectURI == null && theAudioHasPartIterator != null) {
				subjectURI = theAudioHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasPartIterator theNotatedMusicHasPartIterator = (edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasPartIterator.class);

			if (subjectURI == null && theNotatedMusicHasPartIterator != null) {
				subjectURI = theNotatedMusicHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceHasPartIterator theInstanceHasPartIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceHasPartIterator.class);

			if (subjectURI == null && theInstanceHasPartIterator != null) {
				subjectURI = theInstanceHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasPartIterator theMovingImageHasPartIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasPartIterator.class);

			if (subjectURI == null && theMovingImageHasPartIterator != null) {
				subjectURI = theMovingImageHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceHasPartIterator theContinuingResourceHasPartIterator = (edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceHasPartIterator.class);

			if (subjectURI == null && theContinuingResourceHasPartIterator != null) {
				subjectURI = theContinuingResourceHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialHasPartIterator theSerialHasPartIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialHasPartIterator.class);

			if (subjectURI == null && theSerialHasPartIterator != null) {
				subjectURI = theSerialHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator theStillImageHasPartIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator.class);

			if (subjectURI == null && theStillImageHasPartIterator != null) {
				subjectURI = theStillImageHasPartIterator.getHasPart();
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

			edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceIsPartOfIterator theFiniteResourceIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.FiniteResource.FiniteResourceIsPartOfIterator.class);

			if (subjectURI == null && theFiniteResourceIsPartOfIterator != null) {
				subjectURI = theFiniteResourceIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographIsPartOfIterator theMonographIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographIsPartOfIterator.class);

			if (subjectURI == null && theMonographIsPartOfIterator != null) {
				subjectURI = theMonographIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextIsPartOfIterator theTextIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Text.TextIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextIsPartOfIterator.class);

			if (subjectURI == null && theTextIsPartOfIterator != null) {
				subjectURI = theTextIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Audio.AudioIsPartOfIterator theAudioIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Audio.AudioIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Audio.AudioIsPartOfIterator.class);

			if (subjectURI == null && theAudioIsPartOfIterator != null) {
				subjectURI = theAudioIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceIsPartOfIterator theInstanceIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceIsPartOfIterator.class);

			if (subjectURI == null && theInstanceIsPartOfIterator != null) {
				subjectURI = theInstanceIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographyIsPartOfIterator theCartographyIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographyIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographyIsPartOfIterator.class);

			if (subjectURI == null && theCartographyIsPartOfIterator != null) {
				subjectURI = theCartographyIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageIsPartOfIterator theMovingImageIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageIsPartOfIterator.class);

			if (subjectURI == null && theMovingImageIsPartOfIterator != null) {
				subjectURI = theMovingImageIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicIsPartOfIterator theNotatedMusicIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicIsPartOfIterator.class);

			if (subjectURI == null && theNotatedMusicIsPartOfIterator != null) {
				subjectURI = theNotatedMusicIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageIsPartOfIterator theStillImageIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageIsPartOfIterator.class);

			if (subjectURI == null && theStillImageIsPartOfIterator != null) {
				subjectURI = theStillImageIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceIsPartOfIterator theContinuingResourceIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ContinuingResource.ContinuingResourceIsPartOfIterator.class);

			if (subjectURI == null && theContinuingResourceIsPartOfIterator != null) {
				subjectURI = theContinuingResourceIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialIsPartOfIterator theSerialIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialIsPartOfIterator.class);

			if (subjectURI == null && theSerialIsPartOfIterator != null) {
				subjectURI = theSerialIsPartOfIterator.getIsPartOf();
			}

			if (theEventIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Event doStartTag", e);
			throw new JspTagException("Exception raised in Event doStartTag");
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
			log.error("Exception raised in Event doEndTag", e);
			throw new JspTagException("Exception raised in Event doEndTag");
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
