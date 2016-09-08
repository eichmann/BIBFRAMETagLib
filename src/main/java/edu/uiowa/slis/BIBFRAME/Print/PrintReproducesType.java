package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintReproducesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrintReproducesIterator thePrintReproducesIterator = (PrintReproducesIterator)findAncestorWithClass(this, PrintReproducesIterator.class);
			pageContext.getOut().print(thePrintReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

