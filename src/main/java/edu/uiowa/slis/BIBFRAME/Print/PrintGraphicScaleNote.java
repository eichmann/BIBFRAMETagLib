package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintGraphicScaleNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintGraphicScaleNote currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintGraphicScaleNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrintGraphicScaleNoteIterator thePrint = (PrintGraphicScaleNoteIterator)findAncestorWithClass(this, PrintGraphicScaleNoteIterator.class);
			pageContext.getOut().print(thePrint.getGraphicScaleNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for graphicScaleNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for graphicScaleNote tag ");
		}
		return SKIP_BODY;
	}
}

