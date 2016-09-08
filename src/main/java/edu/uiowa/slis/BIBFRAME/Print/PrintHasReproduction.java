package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintHasReproduction extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintHasReproduction currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintHasReproduction.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrintHasReproductionIterator thePrintHasReproductionIterator = (PrintHasReproductionIterator)findAncestorWithClass(this, PrintHasReproductionIterator.class);
			pageContext.getOut().print(thePrintHasReproductionIterator.getHasReproduction());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for hasReproduction tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for hasReproduction tag ");
		}
		return SKIP_BODY;
	}
}

