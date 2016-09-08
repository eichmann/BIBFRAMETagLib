package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Print thePrint = (Print)findAncestorWithClass(this, Print.class);
			if (!thePrint.commitNeeded) {
				pageContext.getOut().print(thePrint.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Print for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Print thePrint = (Print)findAncestorWithClass(this, Print.class);
			return thePrint.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Print for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Print thePrint = (Print)findAncestorWithClass(this, Print.class);
			thePrint.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Print for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for subjectURI tag ");
		}
	}
}

