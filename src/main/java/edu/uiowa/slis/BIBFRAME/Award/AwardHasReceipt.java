package edu.uiowa.slis.BIBFRAME.Award;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AwardHasReceipt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AwardHasReceipt currentInstance = null;
	private static final Log log = LogFactory.getLog(AwardHasReceipt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AwardHasReceiptIterator theAwardHasReceiptIterator = (AwardHasReceiptIterator)findAncestorWithClass(this, AwardHasReceiptIterator.class);
			pageContext.getOut().print(theAwardHasReceiptIterator.getHasReceipt());
		} catch (Exception e) {
			log.error("Can't find enclosing Award for hasReceipt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Award for hasReceipt tag ");
		}
		return SKIP_BODY;
	}
}

