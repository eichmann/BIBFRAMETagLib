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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkFollowsInNarrativeIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkFollowsInNarrativeIterator)this.getParent()).getFollowsInNarrative();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkSeparatedIntoIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkSeparatedIntoIterator)this.getParent()).getSeparatedInto();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkHasDataSourceIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkHasDataSourceIterator)this.getParent()).getHasDataSource();
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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Contribution.ContributionContributedToIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Contribution.ContributionContributedToIterator)this.getParent()).getContributedTo();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Location.LocationHasOriginPlaceInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Location.LocationHasOriginPlaceInverseIterator)this.getParent()).getHasOriginPlaceInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.AcademicDegree.AcademicDegreeCreatedForDegreeInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.AcademicDegree.AcademicDegreeCreatedForDegreeInverseIterator)this.getParent()).getCreatedForDegreeInverse();
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
