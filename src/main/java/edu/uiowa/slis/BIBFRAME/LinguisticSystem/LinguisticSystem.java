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

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Work.WorkLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Work.WorkLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Text.TextLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Text.TextLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Monograph.MonographLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Monograph.MonographLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Serial.SerialLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Serial.SerialLanguageIterator)this.getParent()).getLanguage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceLanguageIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceLanguageIterator)this.getParent()).getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Work.WorkLanguageIterator theWorkLanguageIterator = (edu.uiowa.slis.BIBFRAME.Work.WorkLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Work.WorkLanguageIterator.class);

			if (subjectURI == null && theWorkLanguageIterator != null) {
				subjectURI = theWorkLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Text.TextLanguageIterator theTextLanguageIterator = (edu.uiowa.slis.BIBFRAME.Text.TextLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Text.TextLanguageIterator.class);

			if (subjectURI == null && theTextLanguageIterator != null) {
				subjectURI = theTextLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Monograph.MonographLanguageIterator theMonographLanguageIterator = (edu.uiowa.slis.BIBFRAME.Monograph.MonographLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Monograph.MonographLanguageIterator.class);

			if (subjectURI == null && theMonographLanguageIterator != null) {
				subjectURI = theMonographLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.Serial.SerialLanguageIterator theSerialLanguageIterator = (edu.uiowa.slis.BIBFRAME.Serial.SerialLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Serial.SerialLanguageIterator.class);

			if (subjectURI == null && theSerialLanguageIterator != null) {
				subjectURI = theSerialLanguageIterator.getLanguage();
			}

			edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceLanguageIterator theIntegratingResourceLanguageIterator = (edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceLanguageIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.IntegratingResource.IntegratingResourceLanguageIterator.class);

			if (subjectURI == null && theIntegratingResourceLanguageIterator != null) {
				subjectURI = theIntegratingResourceLanguageIterator.getLanguage();
			}

			if (theLinguisticSystemIterator == null && subjectURI == null) {
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
