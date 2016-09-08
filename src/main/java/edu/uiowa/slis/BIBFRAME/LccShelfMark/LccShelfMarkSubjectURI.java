package edu.uiowa.slis.BIBFRAME.LccShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LccShelfMarkSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LccShelfMarkSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(LccShelfMarkSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LccShelfMark theLccShelfMark = (LccShelfMark)findAncestorWithClass(this, LccShelfMark.class);
			if (!theLccShelfMark.commitNeeded) {
				pageContext.getOut().print(theLccShelfMark.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LccShelfMark for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccShelfMark for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			LccShelfMark theLccShelfMark = (LccShelfMark)findAncestorWithClass(this, LccShelfMark.class);
			return theLccShelfMark.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing LccShelfMark for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccShelfMark for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			LccShelfMark theLccShelfMark = (LccShelfMark)findAncestorWithClass(this, LccShelfMark.class);
			theLccShelfMark.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing LccShelfMark for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccShelfMark for subjectURI tag ");
		}
	}
}

