package edu.uiowa.slis.BIBFRAME.AwardReceipt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AwardReceiptReceivedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AwardReceiptReceivedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(AwardReceiptReceivedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AwardReceiptReceivedByIterator theAwardReceiptReceivedByIterator = (AwardReceiptReceivedByIterator)findAncestorWithClass(this, AwardReceiptReceivedByIterator.class);
			pageContext.getOut().print(theAwardReceiptReceivedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AwardReceipt for receivedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing AwardReceipt for receivedBy tag ");
		}
		return SKIP_BODY;
	}
}

