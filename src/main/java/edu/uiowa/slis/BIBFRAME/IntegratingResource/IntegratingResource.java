package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class IntegratingResource extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResource currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResource.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			IntegratingResourceIterator theIntegratingResourceIterator = (IntegratingResourceIterator) findAncestorWithClass(this, IntegratingResourceIterator.class);

			if (theIntegratingResourceIterator != null) {
				subjectURI = theIntegratingResourceIterator.getSubjectURI();
				label = theIntegratingResourceIterator.getLabel();
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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.LinguisticSystem.LinguisticSystemLanguageInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.LinguisticSystem.LinguisticSystemLanguageInverseIterator)this.getParent()).getLanguageInverse();
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

			if (theIntegratingResourceIterator == null && subjectURI == null) {
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
			log.error("Exception raised in IntegratingResource doStartTag", e);
			throw new JspTagException("Exception raised in IntegratingResource doStartTag");
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
			log.error("Exception raised in IntegratingResource doEndTag", e);
			throw new JspTagException("Exception raised in IntegratingResource doEndTag");
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
