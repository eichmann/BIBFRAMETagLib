package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Work extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Work currentInstance = null;
	private static final Log log = LogFactory.getLog(Work.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			WorkIterator theWorkIterator = (WorkIterator) findAncestorWithClass(this, WorkIterator.class);

			if (theWorkIterator != null) {
				subjectURI = theWorkIterator.getSubjectURI();
				label = theWorkIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Audio.AudioRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Audio.AudioRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographyRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographyRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Dataset.DatasetRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Dataset.DatasetRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Collection.CollectionRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Collection.CollectionRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Title.TitleHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Title.TitleHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkHasPartIterator)this.getParent()).getHasPart();
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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.AbbreviatedTitle.AbbreviatedTitleHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.AbbreviatedTitle.AbbreviatedTitleHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Collection.CollectionHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Collection.CollectionHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Dataset.DatasetSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Dataset.DatasetSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator)this.getParent()).getHasTarget();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator)this.getParent()).getIsPartOf();
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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographyIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographyIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Collection.CollectionIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Collection.CollectionIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Dataset.DatasetIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Dataset.DatasetIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkFollowsInNarrativeIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkFollowsInNarrativeIterator)this.getParent()).getFollowsInNarrative();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkSeparatedIntoIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkSeparatedIntoIterator)this.getParent()).getSeparatedInto();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkHasDataSourceIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkHasDataSourceIterator)this.getParent()).getHasDataSource();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialHasFirstIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialHasFirstIterator)this.getParent()).getHasFirst();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkContinuesUnderNewTitleIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkContinuesUnderNewTitleIterator)this.getParent()).getContinuesUnderNewTitle();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkIsFindingAidForIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkIsFindingAidForIterator)this.getParent()).getIsFindingAidFor();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkAbsorbedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkAbsorbedByIterator)this.getParent()).getAbsorbedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkHasExpressionIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkHasExpressionIterator)this.getParent()).getHasExpression();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkSeparatedFromIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkSeparatedFromIterator)this.getParent()).getSeparatedFrom();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Title.TitleIsTitleOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Title.TitleIsTitleOfIterator)this.getParent()).getIsTitleOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkTranslatedAsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkTranslatedAsIterator)this.getParent()).getTranslatedAs();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkHasDerivativeIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkHasDerivativeIterator)this.getParent()).getHasDerivative();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Title.TitleHasDerivativeIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Title.TitleHasDerivativeIterator)this.getParent()).getHasDerivative();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkTranslatesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkTranslatesIterator)this.getParent()).getTranslates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkHasAbsorbedIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkHasAbsorbedIterator)this.getParent()).getHasAbsorbed();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.AwardReceipt.AwardReceiptReceivedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.AwardReceipt.AwardReceiptReceivedByIterator)this.getParent()).getReceivedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesInNarrativeIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesInNarrativeIterator)this.getParent()).getPrecedesInNarrative();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Title.TitleIsPreferredTitleOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Title.TitleIsPreferredTitleOfIterator)this.getParent()).getIsPreferredTitleOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialHasLastIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialHasLastIterator)this.getParent()).getHasLast();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkSupersedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkSupersedesIterator)this.getParent()).getSupersedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkIsExpressionOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkIsExpressionOfIterator)this.getParent()).getIsExpressionOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Event.EventRecordedInIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Event.EventRecordedInIterator)this.getParent()).getRecordedIn();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkSupplementsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkSupplementsIterator)this.getParent()).getSupplements();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkDerivedFromIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkDerivedFromIterator)this.getParent()).getDerivedFrom();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Title.TitleDerivedFromIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Title.TitleDerivedFromIterator)this.getParent()).getDerivedFrom();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkHasOtherEditionIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkHasOtherEditionIterator)this.getParent()).getHasOtherEdition();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkHasSupplementIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkHasSupplementIterator)this.getParent()).getHasSupplement();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkHasFindingAidIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkHasFindingAidIterator)this.getParent()).getHasFindingAid();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkContinuedUnderNewTitleByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkContinuedUnderNewTitleByIterator)this.getParent()).getContinuedUnderNewTitleBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkHasOriginalVersionIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkHasOriginalVersionIterator)this.getParent()).getHasOriginalVersion();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkSupersededByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkSupersededByIterator)this.getParent()).getSupersededBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceIsInstanceOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceIsInstanceOfIterator)this.getParent()).getIsInstanceOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Event.EventPerformanceOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Event.EventPerformanceOfIterator)this.getParent()).getPerformanceOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.PublisherProvision.PublisherProvisionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.PublisherProvision.PublisherProvisionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.CreatorContribution.CreatorContributionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.CreatorContribution.CreatorContributionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Contribution.ContributionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Contribution.ContributionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.PerformerContribution.PerformerContributionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.PerformerContribution.PerformerContributionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ConductorContribution.ConductorContributionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ConductorContribution.ConductorContributionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.AuthorContribution.AuthorContributionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.AuthorContribution.AuthorContributionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.EditorContribution.EditorContributionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.EditorContribution.EditorContributionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.ComposerContribution.ComposerContributionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.ComposerContribution.ComposerContributionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NarratorContribution.NarratorContributionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NarratorContribution.NarratorContributionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.DistributorProvision.DistributorProvisionAgentIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.DistributorProvision.DistributorProvisionAgentIterator)this.getParent()).getAgent();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Contribution.ContributionContributedToIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Contribution.ContributionContributedToIterator)this.getParent()).getContributedTo();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Organization.OrganizationRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Organization.OrganizationRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Location.LocationRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Location.LocationRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Agent.AgentRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Agent.AgentRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Person.PersonRelationInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Person.PersonRelationInverseIterator)this.getParent()).getRelationInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.LinguisticSystem.LinguisticSystemLanguageInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.LinguisticSystem.LinguisticSystemLanguageInverseIterator)this.getParent()).getLanguageInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Location.LocationHasOriginPlaceInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Location.LocationHasOriginPlaceInverseIterator)this.getParent()).getHasOriginPlaceInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.AcademicDegree.AcademicDegreeCreatedForDegreeInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.AcademicDegree.AcademicDegreeCreatedForDegreeInverseIterator)this.getParent()).getCreatedForDegreeInverse();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkRelationIterator theWorkRelationIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkRelationIterator.class);

			if (subjectURI == null && theWorkRelationIterator != null) {
				subjectURI = theWorkRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationIterator theMonographRelationIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationIterator.class);

			if (subjectURI == null && theMonographRelationIterator != null) {
				subjectURI = theMonographRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator theTextRelationIterator = (edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator.class);

			if (subjectURI == null && theTextRelationIterator != null) {
				subjectURI = theTextRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicRelationIterator theNotatedMusicRelationIterator = (edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicRelationIterator.class);

			if (subjectURI == null && theNotatedMusicRelationIterator != null) {
				subjectURI = theNotatedMusicRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialRelationIterator theSerialRelationIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialRelationIterator.class);

			if (subjectURI == null && theSerialRelationIterator != null) {
				subjectURI = theSerialRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Audio.AudioRelationIterator theAudioRelationIterator = (edu.uiowa.slis.BIBFRAME.Audio.AudioRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Audio.AudioRelationIterator.class);

			if (subjectURI == null && theAudioRelationIterator != null) {
				subjectURI = theAudioRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageRelationIterator theMovingImageRelationIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageRelationIterator.class);

			if (subjectURI == null && theMovingImageRelationIterator != null) {
				subjectURI = theMovingImageRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographyRelationIterator theCartographyRelationIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographyRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographyRelationIterator.class);

			if (subjectURI == null && theCartographyRelationIterator != null) {
				subjectURI = theCartographyRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Dataset.DatasetRelationIterator theDatasetRelationIterator = (edu.uiowa.slis.BIBFRAME.Dataset.DatasetRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Dataset.DatasetRelationIterator.class);

			if (subjectURI == null && theDatasetRelationIterator != null) {
				subjectURI = theDatasetRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaRelationIterator theMultimediaRelationIterator = (edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaRelationIterator.class);

			if (subjectURI == null && theMultimediaRelationIterator != null) {
				subjectURI = theMultimediaRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Collection.CollectionRelationIterator theCollectionRelationIterator = (edu.uiowa.slis.BIBFRAME.Collection.CollectionRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Collection.CollectionRelationIterator.class);

			if (subjectURI == null && theCollectionRelationIterator != null) {
				subjectURI = theCollectionRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageRelationIterator theStillImageRelationIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageRelationIterator.class);

			if (subjectURI == null && theStillImageRelationIterator != null) {
				subjectURI = theStillImageRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceRelationIterator theIntegratingResourceRelationIterator = (edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceRelationIterator.class);

			if (subjectURI == null && theIntegratingResourceRelationIterator != null) {
				subjectURI = theIntegratingResourceRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Title.TitleHasPartIterator theTitleHasPartIterator = (edu.uiowa.slis.BIBFRAME.Title.TitleHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Title.TitleHasPartIterator.class);

			if (subjectURI == null && theTitleHasPartIterator != null) {
				subjectURI = theTitleHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkHasPartIterator theWorkHasPartIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkHasPartIterator.class);

			if (subjectURI == null && theWorkHasPartIterator != null) {
				subjectURI = theWorkHasPartIterator.getHasPart();
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

			edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator theKeyTitleHasPartIterator = (edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator.class);

			if (subjectURI == null && theKeyTitleHasPartIterator != null) {
				subjectURI = theKeyTitleHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.AbbreviatedTitle.AbbreviatedTitleHasPartIterator theAbbreviatedTitleHasPartIterator = (edu.uiowa.slis.BIBFRAME.AbbreviatedTitle.AbbreviatedTitleHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.AbbreviatedTitle.AbbreviatedTitleHasPartIterator.class);

			if (subjectURI == null && theAbbreviatedTitleHasPartIterator != null) {
				subjectURI = theAbbreviatedTitleHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialHasPartIterator theSerialHasPartIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialHasPartIterator.class);

			if (subjectURI == null && theSerialHasPartIterator != null) {
				subjectURI = theSerialHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasPartIterator theMovingImageHasPartIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageHasPartIterator.class);

			if (subjectURI == null && theMovingImageHasPartIterator != null) {
				subjectURI = theMovingImageHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator theStillImageHasPartIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageHasPartIterator.class);

			if (subjectURI == null && theStillImageHasPartIterator != null) {
				subjectURI = theStillImageHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasPartIterator theDatasetHasPartIterator = (edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Dataset.DatasetHasPartIterator.class);

			if (subjectURI == null && theDatasetHasPartIterator != null) {
				subjectURI = theDatasetHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasPartIterator theMultimediaHasPartIterator = (edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaHasPartIterator.class);

			if (subjectURI == null && theMultimediaHasPartIterator != null) {
				subjectURI = theMultimediaHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Collection.CollectionHasPartIterator theCollectionHasPartIterator = (edu.uiowa.slis.BIBFRAME.Collection.CollectionHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Collection.CollectionHasPartIterator.class);

			if (subjectURI == null && theCollectionHasPartIterator != null) {
				subjectURI = theCollectionHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasPartIterator theCartographyHasPartIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographyHasPartIterator.class);

			if (subjectURI == null && theCartographyHasPartIterator != null) {
				subjectURI = theCartographyHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceHasPartIterator theIntegratingResourceHasPartIterator = (edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceHasPartIterator.class);

			if (subjectURI == null && theIntegratingResourceHasPartIterator != null) {
				subjectURI = theIntegratingResourceHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkSubjectIterator theWorkSubjectIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkSubjectIterator.class);

			if (subjectURI == null && theWorkSubjectIterator != null) {
				subjectURI = theWorkSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator theTextSubjectIterator = (edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator.class);

			if (subjectURI == null && theTextSubjectIterator != null) {
				subjectURI = theTextSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator theMonographSubjectIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator.class);

			if (subjectURI == null && theMonographSubjectIterator != null) {
				subjectURI = theMonographSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator theSerialSubjectIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator.class);

			if (subjectURI == null && theSerialSubjectIterator != null) {
				subjectURI = theSerialSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator theNotatedMusicSubjectIterator = (edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator.class);

			if (subjectURI == null && theNotatedMusicSubjectIterator != null) {
				subjectURI = theNotatedMusicSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator theAudioSubjectIterator = (edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator.class);

			if (subjectURI == null && theAudioSubjectIterator != null) {
				subjectURI = theAudioSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageSubjectIterator theMovingImageSubjectIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageSubjectIterator.class);

			if (subjectURI == null && theMovingImageSubjectIterator != null) {
				subjectURI = theMovingImageSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator theCartographySubjectIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator.class);

			if (subjectURI == null && theCartographySubjectIterator != null) {
				subjectURI = theCartographySubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Dataset.DatasetSubjectIterator theDatasetSubjectIterator = (edu.uiowa.slis.BIBFRAME.Dataset.DatasetSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Dataset.DatasetSubjectIterator.class);

			if (subjectURI == null && theDatasetSubjectIterator != null) {
				subjectURI = theDatasetSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaSubjectIterator theMultimediaSubjectIterator = (edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaSubjectIterator.class);

			if (subjectURI == null && theMultimediaSubjectIterator != null) {
				subjectURI = theMultimediaSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator theCollectionSubjectIterator = (edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator.class);

			if (subjectURI == null && theCollectionSubjectIterator != null) {
				subjectURI = theCollectionSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator theStillImageSubjectIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator.class);

			if (subjectURI == null && theStillImageSubjectIterator != null) {
				subjectURI = theStillImageSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceSubjectIterator theIntegratingResourceSubjectIterator = (edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceSubjectIterator.class);

			if (subjectURI == null && theIntegratingResourceSubjectIterator != null) {
				subjectURI = theIntegratingResourceSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectSubjectIterator theThreeDimensionalObjectSubjectIterator = (edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject.ThreeDimensionalObjectSubjectIterator.class);

			if (subjectURI == null && theThreeDimensionalObjectSubjectIterator != null) {
				subjectURI = theThreeDimensionalObjectSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator theAnnotationHasTargetIterator = (edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator.class);

			if (subjectURI == null && theAnnotationHasTargetIterator != null) {
				subjectURI = theAnnotationHasTargetIterator.getHasTarget();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator theWorkIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator.class);

			if (subjectURI == null && theWorkIsPartOfIterator != null) {
				subjectURI = theWorkIsPartOfIterator.getIsPartOf();
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

			edu.uiowa.slis.BIBFRAME.Serial.SerialIsPartOfIterator theSerialIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialIsPartOfIterator.class);

			if (subjectURI == null && theSerialIsPartOfIterator != null) {
				subjectURI = theSerialIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicIsPartOfIterator theNotatedMusicIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicIsPartOfIterator.class);

			if (subjectURI == null && theNotatedMusicIsPartOfIterator != null) {
				subjectURI = theNotatedMusicIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographyIsPartOfIterator theCartographyIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographyIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographyIsPartOfIterator.class);

			if (subjectURI == null && theCartographyIsPartOfIterator != null) {
				subjectURI = theCartographyIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageIsPartOfIterator theMovingImageIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MovingImage.MovingImageIsPartOfIterator.class);

			if (subjectURI == null && theMovingImageIsPartOfIterator != null) {
				subjectURI = theMovingImageIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Collection.CollectionIsPartOfIterator theCollectionIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Collection.CollectionIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Collection.CollectionIsPartOfIterator.class);

			if (subjectURI == null && theCollectionIsPartOfIterator != null) {
				subjectURI = theCollectionIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Dataset.DatasetIsPartOfIterator theDatasetIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Dataset.DatasetIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Dataset.DatasetIsPartOfIterator.class);

			if (subjectURI == null && theDatasetIsPartOfIterator != null) {
				subjectURI = theDatasetIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaIsPartOfIterator theMultimediaIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaIsPartOfIterator.class);

			if (subjectURI == null && theMultimediaIsPartOfIterator != null) {
				subjectURI = theMultimediaIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkFollowsInNarrativeIterator theWorkFollowsInNarrativeIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkFollowsInNarrativeIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkFollowsInNarrativeIterator.class);

			if (subjectURI == null && theWorkFollowsInNarrativeIterator != null) {
				subjectURI = theWorkFollowsInNarrativeIterator.getFollowsInNarrative();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkSeparatedIntoIterator theWorkSeparatedIntoIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkSeparatedIntoIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkSeparatedIntoIterator.class);

			if (subjectURI == null && theWorkSeparatedIntoIterator != null) {
				subjectURI = theWorkSeparatedIntoIterator.getSeparatedInto();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkHasDataSourceIterator theWorkHasDataSourceIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkHasDataSourceIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkHasDataSourceIterator.class);

			if (subjectURI == null && theWorkHasDataSourceIterator != null) {
				subjectURI = theWorkHasDataSourceIterator.getHasDataSource();
			}

			edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementPrecedesIterator theNonSortElementPrecedesIterator = (edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementPrecedesIterator.class);

			if (subjectURI == null && theNonSortElementPrecedesIterator != null) {
				subjectURI = theNonSortElementPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextPrecedesIterator theTextPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Text.TextPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextPrecedesIterator.class);

			if (subjectURI == null && theTextPrecedesIterator != null) {
				subjectURI = theTextPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesIterator theWorkPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesIterator.class);

			if (subjectURI == null && theWorkPrecedesIterator != null) {
				subjectURI = theWorkPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialPrecedesIterator theSerialPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialPrecedesIterator.class);

			if (subjectURI == null && theSerialPrecedesIterator != null) {
				subjectURI = theSerialPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialHasFirstIterator theSerialHasFirstIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialHasFirstIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialHasFirstIterator.class);

			if (subjectURI == null && theSerialHasFirstIterator != null) {
				subjectURI = theSerialHasFirstIterator.getHasFirst();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkContinuesUnderNewTitleIterator theWorkContinuesUnderNewTitleIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkContinuesUnderNewTitleIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkContinuesUnderNewTitleIterator.class);

			if (subjectURI == null && theWorkContinuesUnderNewTitleIterator != null) {
				subjectURI = theWorkContinuesUnderNewTitleIterator.getContinuesUnderNewTitle();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkIsFindingAidForIterator theWorkIsFindingAidForIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkIsFindingAidForIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkIsFindingAidForIterator.class);

			if (subjectURI == null && theWorkIsFindingAidForIterator != null) {
				subjectURI = theWorkIsFindingAidForIterator.getIsFindingAidFor();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkAbsorbedByIterator theWorkAbsorbedByIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkAbsorbedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkAbsorbedByIterator.class);

			if (subjectURI == null && theWorkAbsorbedByIterator != null) {
				subjectURI = theWorkAbsorbedByIterator.getAbsorbedBy();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkHasExpressionIterator theWorkHasExpressionIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkHasExpressionIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkHasExpressionIterator.class);

			if (subjectURI == null && theWorkHasExpressionIterator != null) {
				subjectURI = theWorkHasExpressionIterator.getHasExpression();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkSeparatedFromIterator theWorkSeparatedFromIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkSeparatedFromIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkSeparatedFromIterator.class);

			if (subjectURI == null && theWorkSeparatedFromIterator != null) {
				subjectURI = theWorkSeparatedFromIterator.getSeparatedFrom();
			}

			edu.uiowa.slis.BIBFRAME.Title.TitleIsTitleOfIterator theTitleIsTitleOfIterator = (edu.uiowa.slis.BIBFRAME.Title.TitleIsTitleOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Title.TitleIsTitleOfIterator.class);

			if (subjectURI == null && theTitleIsTitleOfIterator != null) {
				subjectURI = theTitleIsTitleOfIterator.getIsTitleOf();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkTranslatedAsIterator theWorkTranslatedAsIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkTranslatedAsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkTranslatedAsIterator.class);

			if (subjectURI == null && theWorkTranslatedAsIterator != null) {
				subjectURI = theWorkTranslatedAsIterator.getTranslatedAs();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkHasDerivativeIterator theWorkHasDerivativeIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkHasDerivativeIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkHasDerivativeIterator.class);

			if (subjectURI == null && theWorkHasDerivativeIterator != null) {
				subjectURI = theWorkHasDerivativeIterator.getHasDerivative();
			}

			edu.uiowa.slis.BIBFRAME.Title.TitleHasDerivativeIterator theTitleHasDerivativeIterator = (edu.uiowa.slis.BIBFRAME.Title.TitleHasDerivativeIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Title.TitleHasDerivativeIterator.class);

			if (subjectURI == null && theTitleHasDerivativeIterator != null) {
				subjectURI = theTitleHasDerivativeIterator.getHasDerivative();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkTranslatesIterator theWorkTranslatesIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkTranslatesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkTranslatesIterator.class);

			if (subjectURI == null && theWorkTranslatesIterator != null) {
				subjectURI = theWorkTranslatesIterator.getTranslates();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkHasAbsorbedIterator theWorkHasAbsorbedIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkHasAbsorbedIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkHasAbsorbedIterator.class);

			if (subjectURI == null && theWorkHasAbsorbedIterator != null) {
				subjectURI = theWorkHasAbsorbedIterator.getHasAbsorbed();
			}

			edu.uiowa.slis.BIBFRAME.AwardReceipt.AwardReceiptReceivedByIterator theAwardReceiptReceivedByIterator = (edu.uiowa.slis.BIBFRAME.AwardReceipt.AwardReceiptReceivedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.AwardReceipt.AwardReceiptReceivedByIterator.class);

			if (subjectURI == null && theAwardReceiptReceivedByIterator != null) {
				subjectURI = theAwardReceiptReceivedByIterator.getReceivedBy();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesInNarrativeIterator theWorkPrecedesInNarrativeIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesInNarrativeIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesInNarrativeIterator.class);

			if (subjectURI == null && theWorkPrecedesInNarrativeIterator != null) {
				subjectURI = theWorkPrecedesInNarrativeIterator.getPrecedesInNarrative();
			}

			edu.uiowa.slis.BIBFRAME.Title.TitleIsPreferredTitleOfIterator theTitleIsPreferredTitleOfIterator = (edu.uiowa.slis.BIBFRAME.Title.TitleIsPreferredTitleOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Title.TitleIsPreferredTitleOfIterator.class);

			if (subjectURI == null && theTitleIsPreferredTitleOfIterator != null) {
				subjectURI = theTitleIsPreferredTitleOfIterator.getIsPreferredTitleOf();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialHasLastIterator theSerialHasLastIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialHasLastIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialHasLastIterator.class);

			if (subjectURI == null && theSerialHasLastIterator != null) {
				subjectURI = theSerialHasLastIterator.getHasLast();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkSupersedesIterator theWorkSupersedesIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkSupersedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkSupersedesIterator.class);

			if (subjectURI == null && theWorkSupersedesIterator != null) {
				subjectURI = theWorkSupersedesIterator.getSupersedes();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkIsExpressionOfIterator theWorkIsExpressionOfIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkIsExpressionOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkIsExpressionOfIterator.class);

			if (subjectURI == null && theWorkIsExpressionOfIterator != null) {
				subjectURI = theWorkIsExpressionOfIterator.getIsExpressionOf();
			}

			edu.uiowa.slis.BIBFRAME.Event.EventRecordedInIterator theEventRecordedInIterator = (edu.uiowa.slis.BIBFRAME.Event.EventRecordedInIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Event.EventRecordedInIterator.class);

			if (subjectURI == null && theEventRecordedInIterator != null) {
				subjectURI = theEventRecordedInIterator.getRecordedIn();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkSupplementsIterator theWorkSupplementsIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkSupplementsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkSupplementsIterator.class);

			if (subjectURI == null && theWorkSupplementsIterator != null) {
				subjectURI = theWorkSupplementsIterator.getSupplements();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkDerivedFromIterator theWorkDerivedFromIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkDerivedFromIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkDerivedFromIterator.class);

			if (subjectURI == null && theWorkDerivedFromIterator != null) {
				subjectURI = theWorkDerivedFromIterator.getDerivedFrom();
			}

			edu.uiowa.slis.BIBFRAME.Title.TitleDerivedFromIterator theTitleDerivedFromIterator = (edu.uiowa.slis.BIBFRAME.Title.TitleDerivedFromIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Title.TitleDerivedFromIterator.class);

			if (subjectURI == null && theTitleDerivedFromIterator != null) {
				subjectURI = theTitleDerivedFromIterator.getDerivedFrom();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkHasOtherEditionIterator theWorkHasOtherEditionIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkHasOtherEditionIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkHasOtherEditionIterator.class);

			if (subjectURI == null && theWorkHasOtherEditionIterator != null) {
				subjectURI = theWorkHasOtherEditionIterator.getHasOtherEdition();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkHasSupplementIterator theWorkHasSupplementIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkHasSupplementIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkHasSupplementIterator.class);

			if (subjectURI == null && theWorkHasSupplementIterator != null) {
				subjectURI = theWorkHasSupplementIterator.getHasSupplement();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkHasFindingAidIterator theWorkHasFindingAidIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkHasFindingAidIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkHasFindingAidIterator.class);

			if (subjectURI == null && theWorkHasFindingAidIterator != null) {
				subjectURI = theWorkHasFindingAidIterator.getHasFindingAid();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkContinuedUnderNewTitleByIterator theWorkContinuedUnderNewTitleByIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkContinuedUnderNewTitleByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkContinuedUnderNewTitleByIterator.class);

			if (subjectURI == null && theWorkContinuedUnderNewTitleByIterator != null) {
				subjectURI = theWorkContinuedUnderNewTitleByIterator.getContinuedUnderNewTitleBy();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkHasOriginalVersionIterator theWorkHasOriginalVersionIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkHasOriginalVersionIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkHasOriginalVersionIterator.class);

			if (subjectURI == null && theWorkHasOriginalVersionIterator != null) {
				subjectURI = theWorkHasOriginalVersionIterator.getHasOriginalVersion();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkSupersededByIterator theWorkSupersededByIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkSupersededByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkSupersededByIterator.class);

			if (subjectURI == null && theWorkSupersededByIterator != null) {
				subjectURI = theWorkSupersededByIterator.getSupersededBy();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceIsInstanceOfIterator theInstanceIsInstanceOfIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceIsInstanceOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceIsInstanceOfIterator.class);

			if (subjectURI == null && theInstanceIsInstanceOfIterator != null) {
				subjectURI = theInstanceIsInstanceOfIterator.getIsInstanceOf();
			}

			edu.uiowa.slis.BIBFRAME.Event.EventPerformanceOfIterator theEventPerformanceOfIterator = (edu.uiowa.slis.BIBFRAME.Event.EventPerformanceOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Event.EventPerformanceOfIterator.class);

			if (subjectURI == null && theEventPerformanceOfIterator != null) {
				subjectURI = theEventPerformanceOfIterator.getPerformanceOf();
			}

			edu.uiowa.slis.BIBFRAME.PublisherProvision.PublisherProvisionAgentIterator thePublisherProvisionAgentIterator = (edu.uiowa.slis.BIBFRAME.PublisherProvision.PublisherProvisionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.PublisherProvision.PublisherProvisionAgentIterator.class);

			if (subjectURI == null && thePublisherProvisionAgentIterator != null) {
				subjectURI = thePublisherProvisionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.CreatorContribution.CreatorContributionAgentIterator theCreatorContributionAgentIterator = (edu.uiowa.slis.BIBFRAME.CreatorContribution.CreatorContributionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.CreatorContribution.CreatorContributionAgentIterator.class);

			if (subjectURI == null && theCreatorContributionAgentIterator != null) {
				subjectURI = theCreatorContributionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.Contribution.ContributionAgentIterator theContributionAgentIterator = (edu.uiowa.slis.BIBFRAME.Contribution.ContributionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Contribution.ContributionAgentIterator.class);

			if (subjectURI == null && theContributionAgentIterator != null) {
				subjectURI = theContributionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.PerformerContribution.PerformerContributionAgentIterator thePerformerContributionAgentIterator = (edu.uiowa.slis.BIBFRAME.PerformerContribution.PerformerContributionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.PerformerContribution.PerformerContributionAgentIterator.class);

			if (subjectURI == null && thePerformerContributionAgentIterator != null) {
				subjectURI = thePerformerContributionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAgentIterator theManufacturerProvisionAgentIterator = (edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ManufacturerProvision.ManufacturerProvisionAgentIterator.class);

			if (subjectURI == null && theManufacturerProvisionAgentIterator != null) {
				subjectURI = theManufacturerProvisionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.ConductorContribution.ConductorContributionAgentIterator theConductorContributionAgentIterator = (edu.uiowa.slis.BIBFRAME.ConductorContribution.ConductorContributionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ConductorContribution.ConductorContributionAgentIterator.class);

			if (subjectURI == null && theConductorContributionAgentIterator != null) {
				subjectURI = theConductorContributionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.AuthorContribution.AuthorContributionAgentIterator theAuthorContributionAgentIterator = (edu.uiowa.slis.BIBFRAME.AuthorContribution.AuthorContributionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.AuthorContribution.AuthorContributionAgentIterator.class);

			if (subjectURI == null && theAuthorContributionAgentIterator != null) {
				subjectURI = theAuthorContributionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.EditorContribution.EditorContributionAgentIterator theEditorContributionAgentIterator = (edu.uiowa.slis.BIBFRAME.EditorContribution.EditorContributionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.EditorContribution.EditorContributionAgentIterator.class);

			if (subjectURI == null && theEditorContributionAgentIterator != null) {
				subjectURI = theEditorContributionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.ComposerContribution.ComposerContributionAgentIterator theComposerContributionAgentIterator = (edu.uiowa.slis.BIBFRAME.ComposerContribution.ComposerContributionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.ComposerContribution.ComposerContributionAgentIterator.class);

			if (subjectURI == null && theComposerContributionAgentIterator != null) {
				subjectURI = theComposerContributionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.NarratorContribution.NarratorContributionAgentIterator theNarratorContributionAgentIterator = (edu.uiowa.slis.BIBFRAME.NarratorContribution.NarratorContributionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NarratorContribution.NarratorContributionAgentIterator.class);

			if (subjectURI == null && theNarratorContributionAgentIterator != null) {
				subjectURI = theNarratorContributionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.DistributorProvision.DistributorProvisionAgentIterator theDistributorProvisionAgentIterator = (edu.uiowa.slis.BIBFRAME.DistributorProvision.DistributorProvisionAgentIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.DistributorProvision.DistributorProvisionAgentIterator.class);

			if (subjectURI == null && theDistributorProvisionAgentIterator != null) {
				subjectURI = theDistributorProvisionAgentIterator.getAgent();
			}

			edu.uiowa.slis.BIBFRAME.Contribution.ContributionContributedToIterator theContributionContributedToIterator = (edu.uiowa.slis.BIBFRAME.Contribution.ContributionContributedToIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Contribution.ContributionContributedToIterator.class);

			if (subjectURI == null && theContributionContributedToIterator != null) {
				subjectURI = theContributionContributedToIterator.getContributedTo();
			}

			if (theWorkIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Work doStartTag", e);
			throw new JspTagException("Exception raised in Work doStartTag");
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
			log.error("Exception raised in Work doEndTag", e);
			throw new JspTagException("Exception raised in Work doEndTag");
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
