package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintColorContent extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintColorContent currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintColorContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrintColorContentIterator thePrint = (PrintColorContentIterator)findAncestorWithClass(this, PrintColorContentIterator.class);
			pageContext.getOut().print(thePrint.getColorContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for colorContent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for colorContent tag ");
		}
		return SKIP_BODY;
	}
}

