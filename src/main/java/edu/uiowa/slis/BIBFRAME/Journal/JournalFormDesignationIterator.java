package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class JournalFormDesignationIterator extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalFormDesignationIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalFormDesignationIterator.class);

	String subjectURI = null;
	String formDesignation = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Journal ancestorInstance = (Journal) findAncestorWithClass(this, Journal.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://bib.ld4l.org/ontology/legacy/formDesignation> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				formDesignation = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in JournalIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in JournalIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				formDesignation = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in JournalIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in JournalIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Journal doEndTag", e);
			throw new JspTagException("Exception raised in Journal doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setFormDesignation(String formDesignation) {
		this.formDesignation = formDesignation;
	}

	public String getFormDesignation() {
		return formDesignation;
	}

}
