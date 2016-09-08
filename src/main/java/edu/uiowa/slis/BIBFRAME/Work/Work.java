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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.null.nullMergedToFormIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.null.nullMergedToFormIterator)this.getParent()).getMergedToForm();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceIsPartOfIterator)this.getParent()).getIsPartOf();
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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.null.nullFormedBySplittingIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.null.nullFormedBySplittingIterator)this.getParent()).getFormedBySplitting();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkHasExpressionIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkHasExpressionIterator)this.getParent()).getHasExpression();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkSeparatedFromIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkSeparatedFromIterator)this.getParent()).getSeparatedFrom();
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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Dataset.DatasetSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Dataset.DatasetSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkTranslatedAsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkTranslatedAsIterator)this.getParent()).getTranslatedAs();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkTranslatesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkTranslatesIterator)this.getParent()).getTranslates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkHasAbsorbedIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkHasAbsorbedIterator)this.getParent()).getHasAbsorbed();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesInNarrativeIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesInNarrativeIterator)this.getParent()).getPrecedesInNarrative();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialHasLastIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialHasLastIterator)this.getParent()).getHasLast();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationIterator)this.getParent()).getRelation();
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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Title.TitleHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Title.TitleHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.AbbreviatedTitle.AbbreviatedTitleHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.AbbreviatedTitle.AbbreviatedTitleHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator)this.getParent()).getHasTarget();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Contribution.ContributionContributedToIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Contribution.ContributionContributedToIterator)this.getParent()).getContributedTo();
			}

			edu.uiowa.slis.BIBFRAME.null.nullMergedToFormIterator thenullMergedToFormIterator = (edu.uiowa.slis.BIBFRAME.null.nullMergedToFormIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.null.nullMergedToFormIterator.class);

			if (subjectURI == null && thenullMergedToFormIterator != null) {
				subjectURI = thenullMergedToFormIterator.getMergedToForm();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextIsPartOfIterator theTextIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Text.TextIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextIsPartOfIterator.class);

			if (subjectURI == null && theTextIsPartOfIterator != null) {
				subjectURI = theTextIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator theWorkIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator.class);

			if (subjectURI == null && theWorkIsPartOfIterator != null) {
				subjectURI = theWorkIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographIsPartOfIterator theMonographIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographIsPartOfIterator.class);

			if (subjectURI == null && theMonographIsPartOfIterator != null) {
				subjectURI = theMonographIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceIsPartOfIterator theIntegratingResourceIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceIsPartOfIterator.class);

			if (subjectURI == null && theIntegratingResourceIsPartOfIterator != null) {
				subjectURI = theIntegratingResourceIsPartOfIterator.getIsPartOf();
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

			edu.uiowa.slis.BIBFRAME.null.nullFormedBySplittingIterator thenullFormedBySplittingIterator = (edu.uiowa.slis.BIBFRAME.null.nullFormedBySplittingIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.null.nullFormedBySplittingIterator.class);

			if (subjectURI == null && thenullFormedBySplittingIterator != null) {
				subjectURI = thenullFormedBySplittingIterator.getFormedBySplitting();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkHasExpressionIterator theWorkHasExpressionIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkHasExpressionIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkHasExpressionIterator.class);

			if (subjectURI == null && theWorkHasExpressionIterator != null) {
				subjectURI = theWorkHasExpressionIterator.getHasExpression();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkSeparatedFromIterator theWorkSeparatedFromIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkSeparatedFromIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkSeparatedFromIterator.class);

			if (subjectURI == null && theWorkSeparatedFromIterator != null) {
				subjectURI = theWorkSeparatedFromIterator.getSeparatedFrom();
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

			edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceSubjectIterator theIntegratingResourceSubjectIterator = (edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceSubjectIterator.class);

			if (subjectURI == null && theIntegratingResourceSubjectIterator != null) {
				subjectURI = theIntegratingResourceSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Dataset.DatasetSubjectIterator theDatasetSubjectIterator = (edu.uiowa.slis.BIBFRAME.Dataset.DatasetSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Dataset.DatasetSubjectIterator.class);

			if (subjectURI == null && theDatasetSubjectIterator != null) {
				subjectURI = theDatasetSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaSubjectIterator theMultimediaSubjectIterator = (edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Multimedia.MultimediaSubjectIterator.class);

			if (subjectURI == null && theMultimediaSubjectIterator != null) {
				subjectURI = theMultimediaSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkTranslatedAsIterator theWorkTranslatedAsIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkTranslatedAsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkTranslatedAsIterator.class);

			if (subjectURI == null && theWorkTranslatedAsIterator != null) {
				subjectURI = theWorkTranslatedAsIterator.getTranslatedAs();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkTranslatesIterator theWorkTranslatesIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkTranslatesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkTranslatesIterator.class);

			if (subjectURI == null && theWorkTranslatesIterator != null) {
				subjectURI = theWorkTranslatesIterator.getTranslates();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkHasAbsorbedIterator theWorkHasAbsorbedIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkHasAbsorbedIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkHasAbsorbedIterator.class);

			if (subjectURI == null && theWorkHasAbsorbedIterator != null) {
				subjectURI = theWorkHasAbsorbedIterator.getHasAbsorbed();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesInNarrativeIterator theWorkPrecedesInNarrativeIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesInNarrativeIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesInNarrativeIterator.class);

			if (subjectURI == null && theWorkPrecedesInNarrativeIterator != null) {
				subjectURI = theWorkPrecedesInNarrativeIterator.getPrecedesInNarrative();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialHasLastIterator theSerialHasLastIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialHasLastIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialHasLastIterator.class);

			if (subjectURI == null && theSerialHasLastIterator != null) {
				subjectURI = theSerialHasLastIterator.getHasLast();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator theTextRelationIterator = (edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator.class);

			if (subjectURI == null && theTextRelationIterator != null) {
				subjectURI = theTextRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkRelationIterator theWorkRelationIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkRelationIterator.class);

			if (subjectURI == null && theWorkRelationIterator != null) {
				subjectURI = theWorkRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationIterator theMonographRelationIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationIterator.class);

			if (subjectURI == null && theMonographRelationIterator != null) {
				subjectURI = theMonographRelationIterator.getRelation();
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

			edu.uiowa.slis.BIBFRAME.Title.TitleHasPartIterator theTitleHasPartIterator = (edu.uiowa.slis.BIBFRAME.Title.TitleHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Title.TitleHasPartIterator.class);

			if (subjectURI == null && theTitleHasPartIterator != null) {
				subjectURI = theTitleHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkHasPartIterator theWorkHasPartIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkHasPartIterator.class);

			if (subjectURI == null && theWorkHasPartIterator != null) {
				subjectURI = theWorkHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextHasPartIterator theTextHasPartIterator = (edu.uiowa.slis.BIBFRAME.Text.TextHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextHasPartIterator.class);

			if (subjectURI == null && theTextHasPartIterator != null) {
				subjectURI = theTextHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographHasPartIterator theMonographHasPartIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographHasPartIterator.class);

			if (subjectURI == null && theMonographHasPartIterator != null) {
				subjectURI = theMonographHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.AbbreviatedTitle.AbbreviatedTitleHasPartIterator theAbbreviatedTitleHasPartIterator = (edu.uiowa.slis.BIBFRAME.AbbreviatedTitle.AbbreviatedTitleHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.AbbreviatedTitle.AbbreviatedTitleHasPartIterator.class);

			if (subjectURI == null && theAbbreviatedTitleHasPartIterator != null) {
				subjectURI = theAbbreviatedTitleHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator theKeyTitleHasPartIterator = (edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator.class);

			if (subjectURI == null && theKeyTitleHasPartIterator != null) {
				subjectURI = theKeyTitleHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator theAnnotationHasTargetIterator = (edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Annotation.AnnotationHasTargetIterator.class);

			if (subjectURI == null && theAnnotationHasTargetIterator != null) {
				subjectURI = theAnnotationHasTargetIterator.getHasTarget();
			}

			edu.uiowa.slis.BIBFRAME.Contribution.ContributionContributedToIterator theContributionContributedToIterator = (edu.uiowa.slis.BIBFRAME.Contribution.ContributionContributedToIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Contribution.ContributionContributedToIterator.class);

			if (subjectURI == null && theContributionContributedToIterator != null) {
				subjectURI = theContributionContributedToIterator.getContributedTo();
			}

			if (theWorkIterator == null && subjectURI == null) {
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
