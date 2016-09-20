package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class MonographGeographicCoverageNoteIterator extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographGeographicCoverageNoteIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographGeographicCoverageNoteIterator.class);

	String subjectURI = null;
	String geographicCoverageNote = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Monograph ancestorInstance = (Monograph) findAncestorWithClass(this, Monograph.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://bib.ld4l.org/ontology/legacy/geographicCoverageNote> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				geographicCoverageNote = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in MonographIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in MonographIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				geographicCoverageNote = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in MonographIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in MonographIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Monograph doEndTag", e);
			throw new JspTagException("Exception raised in Monograph doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setGeographicCoverageNote(String geographicCoverageNote) {
		this.geographicCoverageNote = geographicCoverageNote;
	}

	public String getGeographicCoverageNote() {
		return geographicCoverageNote;
	}

}
