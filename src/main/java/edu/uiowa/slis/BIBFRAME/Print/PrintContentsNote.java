package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintContentsNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintContentsNote currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintContentsNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrintContentsNoteIterator thePrint = (PrintContentsNoteIterator)findAncestorWithClass(this, PrintContentsNoteIterator.class);
			pageContext.getOut().print(thePrint.getContentsNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for contentsNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for contentsNote tag ");
		}
		return SKIP_BODY;
	}
}

