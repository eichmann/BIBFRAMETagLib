package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintModeOfIssuance extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintModeOfIssuance currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintModeOfIssuance.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrintModeOfIssuanceIterator thePrint = (PrintModeOfIssuanceIterator)findAncestorWithClass(this, PrintModeOfIssuanceIterator.class);
			pageContext.getOut().print(thePrint.getModeOfIssuance());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for modeOfIssuance tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for modeOfIssuance tag ");
		}
		return SKIP_BODY;
	}
}

