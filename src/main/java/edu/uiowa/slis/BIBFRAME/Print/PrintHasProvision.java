package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintHasProvision extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintHasProvision currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintHasProvision.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrintHasProvisionIterator thePrintHasProvisionIterator = (PrintHasProvisionIterator)findAncestorWithClass(this, PrintHasProvisionIterator.class);
			pageContext.getOut().print(thePrintHasProvisionIterator.getHasProvision());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for hasProvision tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for hasProvision tag ");
		}
		return SKIP_BODY;
	}
}

