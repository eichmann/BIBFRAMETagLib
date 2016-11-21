package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ThreeDimensionalObject extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObject currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObject.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ThreeDimensionalObjectIterator theThreeDimensionalObjectIterator = (ThreeDimensionalObjectIterator) findAncestorWithClass(this, ThreeDimensionalObjectIterator.class);

			if (theThreeDimensionalObjectIterator != null) {
				subjectURI = theThreeDimensionalObjectIterator.getSubjectURI();
				label = theThreeDimensionalObjectIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Dataset.DatasetRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Dataset.DatasetRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Audio.AudioRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Audio.AudioRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographyRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographyRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Collection.CollectionRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Collection.CollectionRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Audio.AudioHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Audio.AudioHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Collection.CollectionHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Collection.CollectionHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.AbbreviatedTitle.AbbreviatedTitleHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.AbbreviatedTitle.AbbreviatedTitleHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Dataset.DatasetSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Dataset.DatasetSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator)this.getParent()).getHasTarget();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Dataset.DatasetIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Dataset.DatasetIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Collection.CollectionIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Collection.CollectionIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.PartNameElement.PartNameElementIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.PartNameElement.PartNameElementIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.SubTitleElement.SubTitleElementIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.SubTitleElement.SubTitleElementIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.PartNumberElement.PartNumberElementIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.PartNumberElement.PartNumberElementIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Family.FamilyIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Family.FamilyIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Dataset.DatasetFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Dataset.DatasetFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographyFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographyFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Authority.AuthorityIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Authority.AuthorityIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Topic.TopicIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Topic.TopicIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Meeting.MeetingIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Meeting.MeetingIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Conference.ConferenceIsSubjectOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Conference.ConferenceIsSubjectOfIterator)this.getParent()).getIsSubjectOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ConductorContribution.ConductorContributionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ConductorContribution.ConductorContributionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.EditorContribution.EditorContributionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.EditorContribution.EditorContributionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.CreatorContribution.CreatorContributionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.CreatorContribution.CreatorContributionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NarratorContribution.NarratorContributionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NarratorContribution.NarratorContributionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.AuthorContribution.AuthorContributionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.AuthorContribution.AuthorContributionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ComposerContribution.ComposerContributionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ComposerContribution.ComposerContributionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.PerformerContribution.PerformerContributionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.PerformerContribution.PerformerContributionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.DistributorProvision.DistributorProvisionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.DistributorProvision.DistributorProvisionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.LinguisticSystem.LinguisticSystemLanguageInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.LinguisticSystem.LinguisticSystemLanguageInverseIterator)this.getParent()).getLanguageInverse();
			}

			edu.uiowa.slis.BIBFRAME.Dataset.DatasetRelationIterator theDatasetRelationIterator = (edu.uiowa.slis.BIBFRAME.Dataset.DatasetRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Dataset.DatasetRelationIterator.class);

			if (subjectURI == null && theDatasetRelationIterator != null) {
				subjectURI = theDatasetRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementRelationIterator theNotatedMovementRelationIterator = (edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementRelationIterator.class);

			if (subjectURI == null && theNotatedMovementRelationIterator != null) {
				subjectURI = theNotatedMovementRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Audio.AudioRelationIterator theAudioRelationIterator = (edu.uiowa.slis.BIBFRAME.Audio.AudioRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Audio.AudioRelationIterator.class);

			if (subjectURI == null && theAudioRelationIterator != null) {
				subjectURI = theAudioRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageRelationIterator theMovingImageRelationIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageRelationIterator.class);

			if (subjectURI == null && theMovingImageRelationIterator != null) {
				subjectURI = theMovingImageRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialRelationIterator theSerialRelationIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialRelationIterator.class);

			if (subjectURI == null && theSerialRelationIterator != null) {
				subjectURI = theSerialRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator theTextRelationIterator = (edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator.class);

			if (subjectURI == null && theTextRelationIterator != null) {
				subjectURI = theTextRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceRelationIterator theIntegratingResourceRelationIterator = (edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceRelationIterator.class);

			if (subjectURI == null && theIntegratingResourceRelationIterator != null) {
				subjectURI = theIntegratingResourceRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographyRelationIterator theCartographyRelationIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographyRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographyRelationIterator.class);

			if (subjectURI == null && theCartographyRelationIterator != null) {
				subjectURI = theCartographyRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Collection.CollectionRelationIterator theCollectionRelationIterator = (edu.uiowa.slis.BIBFRAME.Collection.CollectionRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Collection.CollectionRelationIterator.class);

			if (subjectURI == null && theCollectionRelationIterator != null) {
				subjectURI = theCollectionRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaRelationIterator theMultimediaRelationIterator = (edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaRelationIterator.class);

			if (subjectURI == null && theMultimediaRelationIterator != null) {
				subjectURI = theMultimediaRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasPartIterator theDatasetHasPartIterator = (edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasPartIterator.class);

			if (subjectURI == null && theDatasetHasPartIterator != null) {
				subjectURI = theDatasetHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectHasPartIterator theThreeDimensionalObjectHasPartIterator = (edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectHasPartIterator.class);

			if (subjectURI == null && theThreeDimensionalObjectHasPartIterator != null) {
				subjectURI = theThreeDimensionalObjectHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementHasPartIterator theNotatedMovementHasPartIterator = (edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementHasPartIterator.class);

			if (subjectURI == null && theNotatedMovementHasPartIterator != null) {
				subjectURI = theNotatedMovementHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Audio.AudioHasPartIterator theAudioHasPartIterator = (edu.uiowa.slis.BIBFRAME.Audio.AudioHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Audio.AudioHasPartIterator.class);

			if (subjectURI == null && theAudioHasPartIterator != null) {
				subjectURI = theAudioHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasPartIterator theMovingImageHasPartIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasPartIterator.class);

			if (subjectURI == null && theMovingImageHasPartIterator != null) {
				subjectURI = theMovingImageHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceHasPartIterator theIntegratingResourceHasPartIterator = (edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceHasPartIterator.class);

			if (subjectURI == null && theIntegratingResourceHasPartIterator != null) {
				subjectURI = theIntegratingResourceHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasPartIterator theCartographyHasPartIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasPartIterator.class);

			if (subjectURI == null && theCartographyHasPartIterator != null) {
				subjectURI = theCartographyHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Collection.CollectionHasPartIterator theCollectionHasPartIterator = (edu.uiowa.slis.BIBFRAME.Collection.CollectionHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Collection.CollectionHasPartIterator.class);

			if (subjectURI == null && theCollectionHasPartIterator != null) {
				subjectURI = theCollectionHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator theKeyTitleHasPartIterator = (edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator.class);

			if (subjectURI == null && theKeyTitleHasPartIterator != null) {
				subjectURI = theKeyTitleHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasPartIterator theNotatedMusicHasPartIterator = (edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicHasPartIterator.class);

			if (subjectURI == null && theNotatedMusicHasPartIterator != null) {
				subjectURI = theNotatedMusicHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographHasPartIterator theMonographHasPartIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographHasPartIterator.class);

			if (subjectURI == null && theMonographHasPartIterator != null) {
				subjectURI = theMonographHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator theStillImageHasPartIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator.class);

			if (subjectURI == null && theStillImageHasPartIterator != null) {
				subjectURI = theStillImageHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasPartIterator theMultimediaHasPartIterator = (edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasPartIterator.class);

			if (subjectURI == null && theMultimediaHasPartIterator != null) {
				subjectURI = theMultimediaHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.AbbreviatedTitle.AbbreviatedTitleHasPartIterator theAbbreviatedTitleHasPartIterator = (edu.uiowa.slis.BIBFRAME.AbbreviatedTitle.AbbreviatedTitleHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.AbbreviatedTitle.AbbreviatedTitleHasPartIterator.class);

			if (subjectURI == null && theAbbreviatedTitleHasPartIterator != null) {
				subjectURI = theAbbreviatedTitleHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Dataset.DatasetSubjectIterator theDatasetSubjectIterator = (edu.uiowa.slis.BIBFRAME.Dataset.DatasetSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Dataset.DatasetSubjectIterator.class);

			if (subjectURI == null && theDatasetSubjectIterator != null) {
				subjectURI = theDatasetSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectSubjectIterator theThreeDimensionalObjectSubjectIterator = (edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectSubjectIterator.class);

			if (subjectURI == null && theThreeDimensionalObjectSubjectIterator != null) {
				subjectURI = theThreeDimensionalObjectSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementSubjectIterator theNotatedMovementSubjectIterator = (edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMovement.NotatedMovementSubjectIterator.class);

			if (subjectURI == null && theNotatedMovementSubjectIterator != null) {
				subjectURI = theNotatedMovementSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator theAudioSubjectIterator = (edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator.class);

			if (subjectURI == null && theAudioSubjectIterator != null) {
				subjectURI = theAudioSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageSubjectIterator theMovingImageSubjectIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageSubjectIterator.class);

			if (subjectURI == null && theMovingImageSubjectIterator != null) {
				subjectURI = theMovingImageSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator theSerialSubjectIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator.class);

			if (subjectURI == null && theSerialSubjectIterator != null) {
				subjectURI = theSerialSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator theTextSubjectIterator = (edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator.class);

			if (subjectURI == null && theTextSubjectIterator != null) {
				subjectURI = theTextSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceSubjectIterator theIntegratingResourceSubjectIterator = (edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceSubjectIterator.class);

			if (subjectURI == null && theIntegratingResourceSubjectIterator != null) {
				subjectURI = theIntegratingResourceSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator theCartographySubjectIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator.class);

			if (subjectURI == null && theCartographySubjectIterator != null) {
				subjectURI = theCartographySubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator theCollectionSubjectIterator = (edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator.class);

			if (subjectURI == null && theCollectionSubjectIterator != null) {
				subjectURI = theCollectionSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator theNotatedMusicSubjectIterator = (edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator.class);

			if (subjectURI == null && theNotatedMusicSubjectIterator != null) {
				subjectURI = theNotatedMusicSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator theMonographSubjectIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator.class);

			if (subjectURI == null && theMonographSubjectIterator != null) {
				subjectURI = theMonographSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator theStillImageSubjectIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator.class);

			if (subjectURI == null && theStillImageSubjectIterator != null) {
				subjectURI = theStillImageSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaSubjectIterator theMultimediaSubjectIterator = (edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaSubjectIterator.class);

			if (subjectURI == null && theMultimediaSubjectIterator != null) {
				subjectURI = theMultimediaSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator theAnnotationHasTargetIterator = (edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator.class);

			if (subjectURI == null && theAnnotationHasTargetIterator != null) {
				subjectURI = theAnnotationHasTargetIterator.getHasTarget();
			}

			edu.uiowa.slis.BIBFRAME.Dataset.DatasetIsPartOfIterator theDatasetIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Dataset.DatasetIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Dataset.DatasetIsPartOfIterator.class);

			if (subjectURI == null && theDatasetIsPartOfIterator != null) {
				subjectURI = theDatasetIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectIsPartOfIterator theThreeDimensionalObjectIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectIsPartOfIterator.class);

			if (subjectURI == null && theThreeDimensionalObjectIsPartOfIterator != null) {
				subjectURI = theThreeDimensionalObjectIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceIsPartOfIterator theIntegratingResourceIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceIsPartOfIterator.class);

			if (subjectURI == null && theIntegratingResourceIsPartOfIterator != null) {
				subjectURI = theIntegratingResourceIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementIsPartOfIterator theNonSortElementIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementIsPartOfIterator.class);

			if (subjectURI == null && theNonSortElementIsPartOfIterator != null) {
				subjectURI = theNonSortElementIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Collection.CollectionIsPartOfIterator theCollectionIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Collection.CollectionIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Collection.CollectionIsPartOfIterator.class);

			if (subjectURI == null && theCollectionIsPartOfIterator != null) {
				subjectURI = theCollectionIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementIsPartOfIterator theMainTitleElementIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementIsPartOfIterator.class);

			if (subjectURI == null && theMainTitleElementIsPartOfIterator != null) {
				subjectURI = theMainTitleElementIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.PartNameElement.PartNameElementIsPartOfIterator thePartNameElementIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.PartNameElement.PartNameElementIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.PartNameElement.PartNameElementIsPartOfIterator.class);

			if (subjectURI == null && thePartNameElementIsPartOfIterator != null) {
				subjectURI = thePartNameElementIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.SubTitleElement.SubTitleElementIsPartOfIterator theSubTitleElementIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.SubTitleElement.SubTitleElementIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.SubTitleElement.SubTitleElementIsPartOfIterator.class);

			if (subjectURI == null && theSubTitleElementIsPartOfIterator != null) {
				subjectURI = theSubTitleElementIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.PartNumberElement.PartNumberElementIsPartOfIterator thePartNumberElementIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.PartNumberElement.PartNumberElementIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.PartNumberElement.PartNumberElementIsPartOfIterator.class);

			if (subjectURI == null && thePartNumberElementIsPartOfIterator != null) {
				subjectURI = thePartNumberElementIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaIsPartOfIterator theMultimediaIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaIsPartOfIterator.class);

			if (subjectURI == null && theMultimediaIsPartOfIterator != null) {
				subjectURI = theMultimediaIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Family.FamilyIsPartOfIterator theFamilyIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Family.FamilyIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Family.FamilyIsPartOfIterator.class);

			if (subjectURI == null && theFamilyIsPartOfIterator != null) {
				subjectURI = theFamilyIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectPrecedesIterator theThreeDimensionalObjectPrecedesIterator = (edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectPrecedesIterator.class);

			if (subjectURI == null && theThreeDimensionalObjectPrecedesIterator != null) {
				subjectURI = theThreeDimensionalObjectPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementPrecedesIterator theNonSortElementPrecedesIterator = (edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementPrecedesIterator.class);

			if (subjectURI == null && theNonSortElementPrecedesIterator != null) {
				subjectURI = theNonSortElementPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Dataset.DatasetFollowsIterator theDatasetFollowsIterator = (edu.uiowa.slis.BIBFRAME.Dataset.DatasetFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Dataset.DatasetFollowsIterator.class);

			if (subjectURI == null && theDatasetFollowsIterator != null) {
				subjectURI = theDatasetFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectFollowsIterator theThreeDimensionalObjectFollowsIterator = (edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectFollowsIterator.class);

			if (subjectURI == null && theThreeDimensionalObjectFollowsIterator != null) {
				subjectURI = theThreeDimensionalObjectFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageFollowsIterator theMovingImageFollowsIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageFollowsIterator.class);

			if (subjectURI == null && theMovingImageFollowsIterator != null) {
				subjectURI = theMovingImageFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographyFollowsIterator theCartographyFollowsIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographyFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographyFollowsIterator.class);

			if (subjectURI == null && theCartographyFollowsIterator != null) {
				subjectURI = theCartographyFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageFollowsIterator theStillImageFollowsIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageFollowsIterator.class);

			if (subjectURI == null && theStillImageFollowsIterator != null) {
				subjectURI = theStillImageFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaFollowsIterator theMultimediaFollowsIterator = (edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaFollowsIterator.class);

			if (subjectURI == null && theMultimediaFollowsIterator != null) {
				subjectURI = theMultimediaFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectIsSubjectOfIterator theThreeDimensionalObjectIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectIsSubjectOfIterator.class);

			if (subjectURI == null && theThreeDimensionalObjectIsSubjectOfIterator != null) {
				subjectURI = theThreeDimensionalObjectIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Authority.AuthorityIsSubjectOfIterator theAuthorityIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Authority.AuthorityIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Authority.AuthorityIsSubjectOfIterator.class);

			if (subjectURI == null && theAuthorityIsSubjectOfIterator != null) {
				subjectURI = theAuthorityIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Topic.TopicIsSubjectOfIterator theTopicIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Topic.TopicIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Topic.TopicIsSubjectOfIterator.class);

			if (subjectURI == null && theTopicIsSubjectOfIterator != null) {
				subjectURI = theTopicIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Meeting.MeetingIsSubjectOfIterator theMeetingIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Meeting.MeetingIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Meeting.MeetingIsSubjectOfIterator.class);

			if (subjectURI == null && theMeetingIsSubjectOfIterator != null) {
				subjectURI = theMeetingIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageIsSubjectOfIterator theStillImageIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageIsSubjectOfIterator.class);

			if (subjectURI == null && theStillImageIsSubjectOfIterator != null) {
				subjectURI = theStillImageIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityIsSubjectOfIterator theTemporalEntityIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.TemporalEntity.TemporalEntityIsSubjectOfIterator.class);

			if (subjectURI == null && theTemporalEntityIsSubjectOfIterator != null) {
				subjectURI = theTemporalEntityIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.Conference.ConferenceIsSubjectOfIterator theConferenceIsSubjectOfIterator = (edu.uiowa.slis.BIBFRAME.Conference.ConferenceIsSubjectOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Conference.ConferenceIsSubjectOfIterator.class);

			if (subjectURI == null && theConferenceIsSubjectOfIterator != null) {
				subjectURI = theConferenceIsSubjectOfIterator.getIsSubjectOf();
			}

			edu.uiowa.slis.BIBFRAME.ConductorContribution.ConductorContributionAgentIterator theConductorContributionAgentIterator = (edu.uiowa.slis.BIBFRAME.ConductorContribution.ConductorContributionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ConductorContribution.ConductorContributionAgentIterator.class);

			if (subjectURI == null && theConductorContributionAgentIterator != null) {
				subjectURI = theConductorContributionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.EditorContribution.EditorContributionAgentIterator theEditorContributionAgentIterator = (edu.uiowa.slis.BIBFRAME.EditorContribution.EditorContributionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.EditorContribution.EditorContributionAgentIterator.class);

			if (subjectURI == null && theEditorContributionAgentIterator != null) {
				subjectURI = theEditorContributionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.CreatorContribution.CreatorContributionAgentIterator theCreatorContributionAgentIterator = (edu.uiowa.slis.BIBFRAME.CreatorContribution.CreatorContributionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.CreatorContribution.CreatorContributionAgentIterator.class);

			if (subjectURI == null && theCreatorContributionAgentIterator != null) {
				subjectURI = theCreatorContributionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.NarratorContribution.NarratorContributionAgentIterator theNarratorContributionAgentIterator = (edu.uiowa.slis.BIBFRAME.NarratorContribution.NarratorContributionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NarratorContribution.NarratorContributionAgentIterator.class);

			if (subjectURI == null && theNarratorContributionAgentIterator != null) {
				subjectURI = theNarratorContributionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.AuthorContribution.AuthorContributionAgentIterator theAuthorContributionAgentIterator = (edu.uiowa.slis.BIBFRAME.AuthorContribution.AuthorContributionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.AuthorContribution.AuthorContributionAgentIterator.class);

			if (subjectURI == null && theAuthorContributionAgentIterator != null) {
				subjectURI = theAuthorContributionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.ComposerContribution.ComposerContributionAgentIterator theComposerContributionAgentIterator = (edu.uiowa.slis.BIBFRAME.ComposerContribution.ComposerContributionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ComposerContribution.ComposerContributionAgentIterator.class);

			if (subjectURI == null && theComposerContributionAgentIterator != null) {
				subjectURI = theComposerContributionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.PerformerContribution.PerformerContributionAgentIterator thePerformerContributionAgentIterator = (edu.uiowa.slis.BIBFRAME.PerformerContribution.PerformerContributionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.PerformerContribution.PerformerContributionAgentIterator.class);

			if (subjectURI == null && thePerformerContributionAgentIterator != null) {
				subjectURI = thePerformerContributionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.DistributorProvision.DistributorProvisionAgentIterator theDistributorProvisionAgentIterator = (edu.uiowa.slis.BIBFRAME.DistributorProvision.DistributorProvisionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.DistributorProvision.DistributorProvisionAgentIterator.class);

			if (subjectURI == null && theDistributorProvisionAgentIterator != null) {
				subjectURI = theDistributorProvisionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAgentIterator theManufacturerProvisionAgentIterator = (edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAgentIterator.class);

			if (subjectURI == null && theManufacturerProvisionAgentIterator != null) {
				subjectURI = theManufacturerProvisionAgentIterator.getAgent();
			}

			if (theThreeDimensionalObjectIterator == null && subjectURI == null) {
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
			log.error("Exception raised in ThreeDimensionalObject doStartTag", e);
			throw new JspTagException("Exception raised in ThreeDimensionalObject doStartTag");
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
			log.error("Exception raised in ThreeDimensionalObject doEndTag", e);
			throw new JspTagException("Exception raised in ThreeDimensionalObject doEndTag");
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
