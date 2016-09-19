package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintNote currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrintNoteIterator thePrint = (PrintNoteIterator)findAncestorWithClass(this, PrintNoteIterator.class);
			pageContext.getOut().print(thePrint.getNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for note tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for note tag ");
		}
		return SKIP_BODY;
	}
}

