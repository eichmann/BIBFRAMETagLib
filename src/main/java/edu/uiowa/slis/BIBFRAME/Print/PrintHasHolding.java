package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintHasHolding extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintHasHolding currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintHasHolding.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrintHasHoldingIterator thePrintHasHoldingIterator = (PrintHasHoldingIterator)findAncestorWithClass(this, PrintHasHoldingIterator.class);
			pageContext.getOut().print(thePrintHasHoldingIterator.getHasHolding());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for hasHolding tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for hasHolding tag ");
		}
		return SKIP_BODY;
	}
}

