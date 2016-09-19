package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintHasPreferredTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintHasPreferredTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintHasPreferredTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrintHasPreferredTitleIterator thePrintHasPreferredTitleIterator = (PrintHasPreferredTitleIterator)findAncestorWithClass(this, PrintHasPreferredTitleIterator.class);
			pageContext.getOut().print(thePrintHasPreferredTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

