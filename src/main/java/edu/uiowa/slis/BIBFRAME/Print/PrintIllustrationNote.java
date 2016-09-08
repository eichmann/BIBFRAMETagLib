package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintIllustrationNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintIllustrationNote currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintIllustrationNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrintIllustrationNoteIterator thePrint = (PrintIllustrationNoteIterator)findAncestorWithClass(this, PrintIllustrationNoteIterator.class);
			pageContext.getOut().print(thePrint.getIllustrationNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for illustrationNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for illustrationNote tag ");
		}
		return SKIP_BODY;
	}
}

