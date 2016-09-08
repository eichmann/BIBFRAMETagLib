package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintHasTableOfContentsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintHasTableOfContentsType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintHasTableOfContentsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrintHasTableOfContentsIterator thePrintHasTableOfContentsIterator = (PrintHasTableOfContentsIterator)findAncestorWithClass(this, PrintHasTableOfContentsIterator.class);
			pageContext.getOut().print(thePrintHasTableOfContentsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for hasTableOfContents tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for hasTableOfContents tag ");
		}
		return SKIP_BODY;
	}
}

