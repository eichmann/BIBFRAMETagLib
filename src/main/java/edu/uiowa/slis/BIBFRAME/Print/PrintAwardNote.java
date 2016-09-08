package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintAwardNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintAwardNote currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintAwardNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrintAwardNoteIterator thePrint = (PrintAwardNoteIterator)findAncestorWithClass(this, PrintAwardNoteIterator.class);
			pageContext.getOut().print(thePrint.getAwardNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for awardNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for awardNote tag ");
		}
		return SKIP_BODY;
	}
}

