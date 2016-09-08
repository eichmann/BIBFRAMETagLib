package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintSupplementaryContentNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintSupplementaryContentNote currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintSupplementaryContentNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrintSupplementaryContentNoteIterator thePrint = (PrintSupplementaryContentNoteIterator)findAncestorWithClass(this, PrintSupplementaryContentNoteIterator.class);
			pageContext.getOut().print(thePrint.getSupplementaryContentNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for supplementaryContentNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for supplementaryContentNote tag ");
		}
		return SKIP_BODY;
	}
}

