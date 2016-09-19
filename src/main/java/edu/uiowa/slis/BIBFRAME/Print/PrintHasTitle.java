package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintHasTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrintHasTitleIterator thePrintHasTitleIterator = (PrintHasTitleIterator)findAncestorWithClass(this, PrintHasTitleIterator.class);
			pageContext.getOut().print(thePrintHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

