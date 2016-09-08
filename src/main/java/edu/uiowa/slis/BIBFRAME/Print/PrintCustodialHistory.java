package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintCustodialHistory extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintCustodialHistory currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintCustodialHistory.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrintCustodialHistoryIterator thePrint = (PrintCustodialHistoryIterator)findAncestorWithClass(this, PrintCustodialHistoryIterator.class);
			pageContext.getOut().print(thePrint.getCustodialHistory());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for custodialHistory tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for custodialHistory tag ");
		}
		return SKIP_BODY;
	}
}

