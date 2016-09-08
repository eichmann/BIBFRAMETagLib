package edu.uiowa.slis.BIBFRAME.UdcShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UdcShelfMarkSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static UdcShelfMarkSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(UdcShelfMarkSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			UdcShelfMark theUdcShelfMark = (UdcShelfMark)findAncestorWithClass(this, UdcShelfMark.class);
			if (!theUdcShelfMark.commitNeeded) {
				pageContext.getOut().print(theUdcShelfMark.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing UdcShelfMark for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcShelfMark for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			UdcShelfMark theUdcShelfMark = (UdcShelfMark)findAncestorWithClass(this, UdcShelfMark.class);
			return theUdcShelfMark.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing UdcShelfMark for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcShelfMark for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			UdcShelfMark theUdcShelfMark = (UdcShelfMark)findAncestorWithClass(this, UdcShelfMark.class);
			theUdcShelfMark.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing UdcShelfMark for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcShelfMark for subjectURI tag ");
		}
	}
}

