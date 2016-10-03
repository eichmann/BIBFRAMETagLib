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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Audio.AudioRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Audio.AudioRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.RWO.RWORelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.RWO.RWORelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialRelationIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialRelationIterator)this.getParent()).getRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Title.TitleHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Title.TitleHasPartIterator)this.getParent()).getHasPart();
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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.RWO.RWOHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.RWO.RWOHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.RWO.RWOSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.RWO.RWOSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.SubTitleElement.SubTitleElementIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.SubTitleElement.SubTitleElementIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.PartNumberElement.PartNumberElementIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.PartNumberElement.PartNumberElementIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.PartNameElement.PartNameElementIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.PartNameElement.PartNameElementIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Audio.AudioIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Audio.AudioIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextIsPartOfIterator)this.getParent()).getIsPartOf();
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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialPrecedesIterator)this.getParent()).getPrecedes();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographPrecedesIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographPrecedesIterator)this.getParent()).getPrecedes();
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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Audio.AudioFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Audio.AudioFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.RWO.RWOFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.RWO.RWOFollowsIterator)this.getParent()).getFollows();
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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialAccompaniedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialAccompaniedByIterator)this.getParent()).getAccompaniedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextAccompaniedByIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextAccompaniedByIterator)this.getParent()).getAccompaniedBy();
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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.LinguisticSystem.LinguisticSystemLanguageInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.LinguisticSystem.LinguisticSystemLanguageInverseIterator)this.getParent()).getLanguageInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Location.LocationHasOriginPlaceInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Location.LocationHasOriginPlaceInverseIterator)this.getParent()).getHasOriginPlaceInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.AcademicDegree.AcademicDegreeCreatedForDegreeInverseIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.AcademicDegree.AcademicDegreeCreatedForDegreeInverseIterator)this.getParent()).getCreatedForDegreeInverse();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationIterator theMonographRelationIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographRelationIterator.class);

			if (subjectURI == null && theMonographRelationIterator != null) {
				subjectURI = theMonographRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator theTextRelationIterator = (edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextRelationIterator.class);

			if (subjectURI == null && theTextRelationIterator != null) {
				subjectURI = theTextRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Audio.AudioRelationIterator theAudioRelationIterator = (edu.uiowa.slis.BIBFRAME.Audio.AudioRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Audio.AudioRelationIterator.class);

			if (subjectURI == null && theAudioRelationIterator != null) {
				subjectURI = theAudioRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicRelationIterator theNotatedMusicRelationIterator = (edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicRelationIterator.class);

			if (subjectURI == null && theNotatedMusicRelationIterator != null) {
				subjectURI = theNotatedMusicRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.RWO.RWORelationIterator theRWORelationIterator = (edu.uiowa.slis.BIBFRAME.RWO.RWORelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.RWO.RWORelationIterator.class);

			if (subjectURI == null && theRWORelationIterator != null) {
				subjectURI = theRWORelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceRelationIterator theInstanceRelationIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceRelationIterator.class);

			if (subjectURI == null && theInstanceRelationIterator != null) {
				subjectURI = theInstanceRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialRelationIterator theSerialRelationIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialRelationIterator.class);

			if (subjectURI == null && theSerialRelationIterator != null) {
				subjectURI = theSerialRelationIterator.getRelation();
			}

			edu.uiowa.slis.BIBFRAME.Title.TitleHasPartIterator theTitleHasPartIterator = (edu.uiowa.slis.BIBFRAME.Title.TitleHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Title.TitleHasPartIterator.class);

			if (subjectURI == null && theTitleHasPartIterator != null) {
				subjectURI = theTitleHasPartIterator.getHasPart();
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

			edu.uiowa.slis.BIBFRAME.Work.WorkHasPartIterator theWorkHasPartIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkHasPartIterator.class);

			if (subjectURI == null && theWorkHasPartIterator != null) {
				subjectURI = theWorkHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.RWO.RWOHasPartIterator theRWOHasPartIterator = (edu.uiowa.slis.BIBFRAME.RWO.RWOHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.RWO.RWOHasPartIterator.class);

			if (subjectURI == null && theRWOHasPartIterator != null) {
				subjectURI = theRWOHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceHasPartIterator theInstanceHasPartIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceHasPartIterator.class);

			if (subjectURI == null && theInstanceHasPartIterator != null) {
				subjectURI = theInstanceHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator theKeyTitleHasPartIterator = (edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator.class);

			if (subjectURI == null && theKeyTitleHasPartIterator != null) {
				subjectURI = theKeyTitleHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator theMonographSubjectIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographSubjectIterator.class);

			if (subjectURI == null && theMonographSubjectIterator != null) {
				subjectURI = theMonographSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator theTextSubjectIterator = (edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextSubjectIterator.class);

			if (subjectURI == null && theTextSubjectIterator != null) {
				subjectURI = theTextSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator theAudioSubjectIterator = (edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Audio.AudioSubjectIterator.class);

			if (subjectURI == null && theAudioSubjectIterator != null) {
				subjectURI = theAudioSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator theNotatedMusicSubjectIterator = (edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicSubjectIterator.class);

			if (subjectURI == null && theNotatedMusicSubjectIterator != null) {
				subjectURI = theNotatedMusicSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator theSerialSubjectIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialSubjectIterator.class);

			if (subjectURI == null && theSerialSubjectIterator != null) {
				subjectURI = theSerialSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceSubjectIterator theInstanceSubjectIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceSubjectIterator.class);

			if (subjectURI == null && theInstanceSubjectIterator != null) {
				subjectURI = theInstanceSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator theCollectionSubjectIterator = (edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Collection.CollectionSubjectIterator.class);

			if (subjectURI == null && theCollectionSubjectIterator != null) {
				subjectURI = theCollectionSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.RWO.RWOSubjectIterator theRWOSubjectIterator = (edu.uiowa.slis.BIBFRAME.RWO.RWOSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.RWO.RWOSubjectIterator.class);

			if (subjectURI == null && theRWOSubjectIterator != null) {
				subjectURI = theRWOSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator theCartographySubjectIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographySubjectIterator.class);

			if (subjectURI == null && theCartographySubjectIterator != null) {
				subjectURI = theCartographySubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator theStillImageSubjectIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageSubjectIterator.class);

			if (subjectURI == null && theStillImageSubjectIterator != null) {
				subjectURI = theStillImageSubjectIterator.getSubject();
			}

			edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementIsPartOfIterator theMainTitleElementIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementIsPartOfIterator.class);

			if (subjectURI == null && theMainTitleElementIsPartOfIterator != null) {
				subjectURI = theMainTitleElementIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.SubTitleElement.SubTitleElementIsPartOfIterator theSubTitleElementIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.SubTitleElement.SubTitleElementIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.SubTitleElement.SubTitleElementIsPartOfIterator.class);

			if (subjectURI == null && theSubTitleElementIsPartOfIterator != null) {
				subjectURI = theSubTitleElementIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementIsPartOfIterator theNonSortElementIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementIsPartOfIterator.class);

			if (subjectURI == null && theNonSortElementIsPartOfIterator != null) {
				subjectURI = theNonSortElementIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator theWorkIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkIsPartOfIterator.class);

			if (subjectURI == null && theWorkIsPartOfIterator != null) {
				subjectURI = theWorkIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.PartNumberElement.PartNumberElementIsPartOfIterator thePartNumberElementIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.PartNumberElement.PartNumberElementIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.PartNumberElement.PartNumberElementIsPartOfIterator.class);

			if (subjectURI == null && thePartNumberElementIsPartOfIterator != null) {
				subjectURI = thePartNumberElementIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.PartNameElement.PartNameElementIsPartOfIterator thePartNameElementIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.PartNameElement.PartNameElementIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.PartNameElement.PartNameElementIsPartOfIterator.class);

			if (subjectURI == null && thePartNameElementIsPartOfIterator != null) {
				subjectURI = thePartNameElementIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographIsPartOfIterator theMonographIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographIsPartOfIterator.class);

			if (subjectURI == null && theMonographIsPartOfIterator != null) {
				subjectURI = theMonographIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Audio.AudioIsPartOfIterator theAudioIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Audio.AudioIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Audio.AudioIsPartOfIterator.class);

			if (subjectURI == null && theAudioIsPartOfIterator != null) {
				subjectURI = theAudioIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextIsPartOfIterator theTextIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Text.TextIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextIsPartOfIterator.class);

			if (subjectURI == null && theTextIsPartOfIterator != null) {
				subjectURI = theTextIsPartOfIterator.getIsPartOf();
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

			edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesIterator theWorkPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkPrecedesIterator.class);

			if (subjectURI == null && theWorkPrecedesIterator != null) {
				subjectURI = theWorkPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextPrecedesIterator theTextPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Text.TextPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextPrecedesIterator.class);

			if (subjectURI == null && theTextPrecedesIterator != null) {
				subjectURI = theTextPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialPrecedesIterator theSerialPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialPrecedesIterator.class);

			if (subjectURI == null && theSerialPrecedesIterator != null) {
				subjectURI = theSerialPrecedesIterator.getPrecedes();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographPrecedesIterator theMonographPrecedesIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographPrecedesIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographPrecedesIterator.class);

			if (subjectURI == null && theMonographPrecedesIterator != null) {
				subjectURI = theMonographPrecedesIterator.getPrecedes();
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

			edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementFollowsIterator theMainTitleElementFollowsIterator = (edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementFollowsIterator.class);

			if (subjectURI == null && theMainTitleElementFollowsIterator != null) {
				subjectURI = theMainTitleElementFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographFollowsIterator theMonographFollowsIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographFollowsIterator.class);

			if (subjectURI == null && theMonographFollowsIterator != null) {
				subjectURI = theMonographFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextFollowsIterator theTextFollowsIterator = (edu.uiowa.slis.BIBFRAME.Text.TextFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextFollowsIterator.class);

			if (subjectURI == null && theTextFollowsIterator != null) {
				subjectURI = theTextFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicFollowsIterator theNotatedMusicFollowsIterator = (edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicFollowsIterator.class);

			if (subjectURI == null && theNotatedMusicFollowsIterator != null) {
				subjectURI = theNotatedMusicFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Audio.AudioFollowsIterator theAudioFollowsIterator = (edu.uiowa.slis.BIBFRAME.Audio.AudioFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Audio.AudioFollowsIterator.class);

			if (subjectURI == null && theAudioFollowsIterator != null) {
				subjectURI = theAudioFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkFollowsIterator theWorkFollowsIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkFollowsIterator.class);

			if (subjectURI == null && theWorkFollowsIterator != null) {
				subjectURI = theWorkFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.RWO.RWOFollowsIterator theRWOFollowsIterator = (edu.uiowa.slis.BIBFRAME.RWO.RWOFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.RWO.RWOFollowsIterator.class);

			if (subjectURI == null && theRWOFollowsIterator != null) {
				subjectURI = theRWOFollowsIterator.getFollows();
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

			edu.uiowa.slis.BIBFRAME.Serial.SerialAccompaniedByIterator theSerialAccompaniedByIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialAccompaniedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialAccompaniedByIterator.class);

			if (subjectURI == null && theSerialAccompaniedByIterator != null) {
				subjectURI = theSerialAccompaniedByIterator.getAccompaniedBy();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextAccompaniedByIterator theTextAccompaniedByIterator = (edu.uiowa.slis.BIBFRAME.Text.TextAccompaniedByIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextAccompaniedByIterator.class);

			if (subjectURI == null && theTextAccompaniedByIterator != null) {
				subjectURI = theTextAccompaniedByIterator.getAccompaniedBy();
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
