package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class PrintSupplementaryContentNoteIterator extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintSupplementaryContentNoteIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintSupplementaryContentNoteIterator.class);

	String subjectURI = null;
	String supplementaryContentNote = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Print ancestorInstance = (Print) findAncestorWithClass(this, Print.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s where { <" + subjectURI + "> <http://bib.ld4l.org/ontology/legacy/supplementaryContentNote> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				supplementaryContentNote = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in PrintIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in PrintIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				supplementaryContentNote = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in PrintIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in PrintIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Print doEndTag", e);
			throw new JspTagException("Exception raised in Print doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSupplementaryContentNote(String supplementaryContentNote) {
		this.supplementaryContentNote = supplementaryContentNote;
	}

	public String getSupplementaryContentNote() {
		return supplementaryContentNote;
	}

}
