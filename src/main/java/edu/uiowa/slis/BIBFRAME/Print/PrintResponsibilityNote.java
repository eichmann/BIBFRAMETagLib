package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintResponsibilityNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintResponsibilityNote currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintResponsibilityNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrintResponsibilityNoteIterator thePrint = (PrintResponsibilityNoteIterator)findAncestorWithClass(this, PrintResponsibilityNoteIterator.class);
			pageContext.getOut().print(thePrint.getResponsibilityNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for responsibilityNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for responsibilityNote tag ");
		}
		return SKIP_BODY;
	}
}

