package edu.uiowa.slis.BIBFRAME.AwardReceipt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AwardReceiptReceivedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AwardReceiptReceivedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(AwardReceiptReceivedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AwardReceiptReceivedByIterator theAwardReceiptReceivedByIterator = (AwardReceiptReceivedByIterator)findAncestorWithClass(this, AwardReceiptReceivedByIterator.class);
			pageContext.getOut().print(theAwardReceiptReceivedByIterator.getReceivedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing AwardReceipt for receivedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing AwardReceipt for receivedBy tag ");
		}
		return SKIP_BODY;
	}
}

