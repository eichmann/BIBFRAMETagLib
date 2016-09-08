package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintHasTableOfContents extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintHasTableOfContents currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintHasTableOfContents.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrintHasTableOfContentsIterator thePrintHasTableOfContentsIterator = (PrintHasTableOfContentsIterator)findAncestorWithClass(this, PrintHasTableOfContentsIterator.class);
			pageContext.getOut().print(thePrintHasTableOfContentsIterator.getHasTableOfContents());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for hasTableOfContents tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for hasTableOfContents tag ");
		}
		return SKIP_BODY;
	}
}

