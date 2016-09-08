package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintNotationSystem extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintNotationSystem currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintNotationSystem.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrintNotationSystemIterator thePrint = (PrintNotationSystemIterator)findAncestorWithClass(this, PrintNotationSystemIterator.class);
			pageContext.getOut().print(thePrint.getNotationSystem());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for notationSystem tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for notationSystem tag ");
		}
		return SKIP_BODY;
	}
}

