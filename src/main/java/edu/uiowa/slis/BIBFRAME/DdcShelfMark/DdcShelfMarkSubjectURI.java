package edu.uiowa.slis.BIBFRAME.DdcShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DdcShelfMarkSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DdcShelfMarkSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(DdcShelfMarkSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DdcShelfMark theDdcShelfMark = (DdcShelfMark)findAncestorWithClass(this, DdcShelfMark.class);
			if (!theDdcShelfMark.commitNeeded) {
				pageContext.getOut().print(theDdcShelfMark.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DdcShelfMark for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DdcShelfMark for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			DdcShelfMark theDdcShelfMark = (DdcShelfMark)findAncestorWithClass(this, DdcShelfMark.class);
			return theDdcShelfMark.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing DdcShelfMark for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DdcShelfMark for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			DdcShelfMark theDdcShelfMark = (DdcShelfMark)findAncestorWithClass(this, DdcShelfMark.class);
			theDdcShelfMark.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing DdcShelfMark for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DdcShelfMark for subjectURI tag ");
		}
	}
}

