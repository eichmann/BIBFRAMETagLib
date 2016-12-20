package edu.uiowa.slis.BIBFRAME.TemporalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class TemporalEntity extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TemporalEntity currentInstance = null;
	private static final Log log = LogFactory.getLog(TemporalEntity.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			TemporalEntityIterator theTemporalEntityIterator = (TemporalEntityIterator) findAncestorWithClass(this, TemporalEntityIterator.class);

			if (theTemporalEntityIterator != null) {
				subjectURI = theTemporalEntityIterator.getSubjectURI();
				label = theTemporalEntityIterator.getLabel();
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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.RWO.RWOSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.RWO.RWOSubjectIterator)this.getParent()).getSubject();
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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator)this.getParent()).getIdentifies();
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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Collection.CollectionHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Collection.CollectionHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasPartIterator)this.getParent()).getHasPart();
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

			edu.uiowa.slis.BIBFRAME.RWO.RWOSubjectIterator theRWOSubjectIterator = (edu.uiowa.slis.BIBFRAME.RWO.RWOSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.RWO.RWOSubjectIterator.class);

			if (subjectURI == null && theRWOSubjectIterator != null) {
				subjectURI = theRWOSubjectIterator.getSubject();
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

			edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator theIdentifierIdentifiesIterator = (edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Identifier.IdentifierIdentifiesIterator.class);

			if (subjectURI == null && theIdentifierIdentifiesIterator != null) {
				subjectURI = theIdentifierIdentifiesIterator.getIdentifies();
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

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator theStillImageHasPartIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator.class);

			if (subjectURI == null && theStillImageHasPartIterator != null) {
				subjectURI = theStillImageHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasPartIterator theMultimediaHasPartIterator = (edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasPartIterator.class);

			if (subjectURI == null && theMultimediaHasPartIterator != null) {
				subjectURI = theMultimediaHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Collection.CollectionHasPartIterator theCollectionHasPartIterator = (edu.uiowa.slis.BIBFRAME.Collection.CollectionHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Collection.CollectionHasPartIterator.class);

			if (subjectURI == null && theCollectionHasPartIterator != null) {
				subjectURI = theCollectionHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasPartIterator theDatasetHasPartIterator = (edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasPartIterator.class);

			if (subjectURI == null && theDatasetHasPartIterator != null) {
				subjectURI = theDatasetHasPartIterator.getHasPart();
			}

			if (theTemporalEntityIterator == null && subjectURI == null) {
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
			log.error("Exception raised in TemporalEntity doStartTag", e);
			throw new JspTagException("Exception raised in TemporalEntity doStartTag");
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
			log.error("Exception raised in TemporalEntity doEndTag", e);
			throw new JspTagException("Exception raised in TemporalEntity doEndTag");
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
