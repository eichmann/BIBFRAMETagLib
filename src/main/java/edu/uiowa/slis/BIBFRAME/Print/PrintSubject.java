package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintSubject extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintSubject currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintSubject.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrintSubjectIterator thePrintSubjectIterator = (PrintSubjectIterator)findAncestorWithClass(this, PrintSubjectIterator.class);
			pageContext.getOut().print(thePrintSubjectIterator.getSubject());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for subject tag ");
		}
		return SKIP_BODY;
	}
}

