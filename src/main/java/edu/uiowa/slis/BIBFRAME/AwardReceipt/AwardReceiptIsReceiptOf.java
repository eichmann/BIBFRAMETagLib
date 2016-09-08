package edu.uiowa.slis.BIBFRAME.AwardReceipt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AwardReceiptIsReceiptOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AwardReceiptIsReceiptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(AwardReceiptIsReceiptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AwardReceiptIsReceiptOfIterator theAwardReceiptIsReceiptOfIterator = (AwardReceiptIsReceiptOfIterator)findAncestorWithClass(this, AwardReceiptIsReceiptOfIterator.class);
			pageContext.getOut().print(theAwardReceiptIsReceiptOfIterator.getIsReceiptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing AwardReceipt for isReceiptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing AwardReceipt for isReceiptOf tag ");
		}
		return SKIP_BODY;
	}
}

