package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintIsInstanceOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintIsInstanceOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintIsInstanceOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrintIsInstanceOfIterator thePrintIsInstanceOfIterator = (PrintIsInstanceOfIterator)findAncestorWithClass(this, PrintIsInstanceOfIterator.class);
			pageContext.getOut().print(thePrintIsInstanceOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for isInstanceOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for isInstanceOf tag ");
		}
		return SKIP_BODY;
	}
}

