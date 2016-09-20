package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class PeriodicalPartFormDesignationIterator extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartFormDesignationIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartFormDesignationIterator.class);

	String subjectURI = null;
	String formDesignation = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			PeriodicalPart ancestorInstance = (PeriodicalPart) findAncestorWithClass(this, PeriodicalPart.class);

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
			log.error("Exception raised in PeriodicalPartIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in PeriodicalPartIterator doStartTag");
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
			log.error("Exception raised in PeriodicalPartIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in PeriodicalPartIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in PeriodicalPart doEndTag", e);
			throw new JspTagException("Exception raised in PeriodicalPart doEndTag");
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
