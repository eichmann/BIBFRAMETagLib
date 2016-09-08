package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class TactileFormatOfMusicIterator extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileFormatOfMusicIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileFormatOfMusicIterator.class);

	String subjectURI = null;
	String formatOfMusic = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Tactile ancestorInstance = (Tactile) findAncestorWithClass(this, Tactile.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(Prefix_1_4+"SELECT ?s where { <" + subjectURI + "> <http://bib.ld4l.org/ontology/legacy/formatOfMusic> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				formatOfMusic = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in TactileIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in TactileIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				formatOfMusic = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in TactileIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in TactileIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Tactile doEndTag", e);
			throw new JspTagException("Exception raised in Tactile doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setFormatOfMusic(String formatOfMusic) {
		this.formatOfMusic = formatOfMusic;
	}

	public String getFormatOfMusic() {
		return formatOfMusic;
	}

}
