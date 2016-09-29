package edu.uiowa.slis.BIBFRAME.PartNameElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class PartNameElement extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PartNameElement currentInstance = null;
	private static final Log log = LogFactory.getLog(PartNameElement.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			PartNameElementIterator thePartNameElementIterator = (PartNameElementIterator) findAncestorWithClass(this, PartNameElementIterator.class);

			if (thePartNameElementIterator != null) {
				subjectURI = thePartNameElementIterator.getSubjectURI();
				label = thePartNameElementIterator.getLabel();
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

			if (thePartNameElementIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?rdfValue  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in PartNameElement doStartTag", e);
			throw new JspTagException("Exception raised in PartNameElement doStartTag");
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
			log.error("Exception raised in PartNameElement doEndTag", e);
			throw new JspTagException("Exception raised in PartNameElement doEndTag");
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
