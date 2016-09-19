package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrintHasPartIterator thePrintHasPartIterator = (PrintHasPartIterator)findAncestorWithClass(this, PrintHasPartIterator.class);
			pageContext.getOut().print(thePrintHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

