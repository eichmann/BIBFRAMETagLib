package edu.uiowa.slis.BIBFRAME.MainTitleElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class MainTitleElement extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MainTitleElement currentInstance = null;
	private static final Log log = LogFactory.getLog(MainTitleElement.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			MainTitleElementIterator theMainTitleElementIterator = (MainTitleElementIterator) findAncestorWithClass(this, MainTitleElementIterator.class);

			if (theMainTitleElementIterator != null) {
				subjectURI = theMainTitleElementIterator.getSubjectURI();
				label = theMainTitleElementIterator.getLabel();
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

			if (theMainTitleElementIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in MainTitleElement doStartTag", e);
			throw new JspTagException("Exception raised in MainTitleElement doStartTag");
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
			log.error("Exception raised in MainTitleElement doEndTag", e);
			throw new JspTagException("Exception raised in MainTitleElement doEndTag");
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
