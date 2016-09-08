package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintExtent extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintExtent currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintExtent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrintExtentIterator thePrint = (PrintExtentIterator)findAncestorWithClass(this, PrintExtentIterator.class);
			pageContext.getOut().print(thePrint.getExtent());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for extent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for extent tag ");
		}
		return SKIP_BODY;
	}
}

