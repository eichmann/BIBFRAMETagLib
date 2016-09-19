package edu.uiowa.slis.BIBFRAME.LinguisticSystem;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class LinguisticSystem extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LinguisticSystem currentInstance = null;
	private static final Log log = LogFactory.getLog(LinguisticSystem.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			LinguisticSystemIterator theLinguisticSystemIterator = (LinguisticSystemIterator) findAncestorWithClass(this, LinguisticSystemIterator.class);

			if (theLinguisticSystemIterator != null) {
				subjectURI = theLinguisticSystemIterator.getSubjectURI();
				label = theLinguisticSystemIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Audio.AudioLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Audio.AudioLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Instance.InstanceLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Instance.InstanceLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.RWO.RWOLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.RWO.RWOLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Collection.CollectionLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Collection.CollectionLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Cartography.CartographyLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Cartography.CartographyLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.StillImage.StillImageLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.StillImage.StillImageLanguageIterator)this.getParent()).getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographLanguageIterator theMonographLanguageIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographLanguageIterator.class);

			if (subjectURI == null && theMonographLanguageIterator != null) {
				subjectURI = theMonographLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextLanguageIterator theTextLanguageIterator = (edu.uiowa.slis.BIBFRAME.Text.TextLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextLanguageIterator.class);

			if (subjectURI == null && theTextLanguageIterator != null) {
				subjectURI = theTextLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkLanguageIterator theWorkLanguageIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkLanguageIterator.class);

			if (subjectURI == null && theWorkLanguageIterator != null) {
				subjectURI = theWorkLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Audio.AudioLanguageIterator theAudioLanguageIterator = (edu.uiowa.slis.BIBFRAME.Audio.AudioLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Audio.AudioLanguageIterator.class);

			if (subjectURI == null && theAudioLanguageIterator != null) {
				subjectURI = theAudioLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicLanguageIterator theNotatedMusicLanguageIterator = (edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NotatedMusic.NotatedMusicLanguageIterator.class);

			if (subjectURI == null && theNotatedMusicLanguageIterator != null) {
				subjectURI = theNotatedMusicLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialLanguageIterator theSerialLanguageIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialLanguageIterator.class);

			if (subjectURI == null && theSerialLanguageIterator != null) {
				subjectURI = theSerialLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Instance.InstanceLanguageIterator theInstanceLanguageIterator = (edu.uiowa.slis.BIBFRAME.Instance.InstanceLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Instance.InstanceLanguageIterator.class);

			if (subjectURI == null && theInstanceLanguageIterator != null) {
				subjectURI = theInstanceLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.RWO.RWOLanguageIterator theRWOLanguageIterator = (edu.uiowa.slis.BIBFRAME.RWO.RWOLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.RWO.RWOLanguageIterator.class);

			if (subjectURI == null && theRWOLanguageIterator != null) {
				subjectURI = theRWOLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Collection.CollectionLanguageIterator theCollectionLanguageIterator = (edu.uiowa.slis.BIBFRAME.Collection.CollectionLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Collection.CollectionLanguageIterator.class);

			if (subjectURI == null && theCollectionLanguageIterator != null) {
				subjectURI = theCollectionLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Cartography.CartographyLanguageIterator theCartographyLanguageIterator = (edu.uiowa.slis.BIBFRAME.Cartography.CartographyLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Cartography.CartographyLanguageIterator.class);

			if (subjectURI == null && theCartographyLanguageIterator != null) {
				subjectURI = theCartographyLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.StillImage.StillImageLanguageIterator theStillImageLanguageIterator = (edu.uiowa.slis.BIBFRAME.StillImage.StillImageLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.StillImage.StillImageLanguageIterator.class);

			if (subjectURI == null && theStillImageLanguageIterator != null) {
				subjectURI = theStillImageLanguageIterator.getLanguage();
			}

			if (theLinguisticSystemIterator == null && subjectURI == null) {
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
			log.error("Exception raised in LinguisticSystem doStartTag", e);
			throw new JspTagException("Exception raised in LinguisticSystem doStartTag");
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
			log.error("Exception raised in LinguisticSystem doEndTag", e);
			throw new JspTagException("Exception raised in LinguisticSystem doEndTag");
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
