package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintIdentifiedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintIdentifiedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintIdentifiedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrintIdentifiedByIterator thePrintIdentifiedByIterator = (PrintIdentifiedByIterator)findAncestorWithClass(this, PrintIdentifiedByIterator.class);
			pageContext.getOut().print(thePrintIdentifiedByIterator.getIdentifiedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

