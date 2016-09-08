package edu.uiowa.slis.BIBFRAME.AwardReceipt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AwardReceiptLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AwardReceiptLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AwardReceiptLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AwardReceipt theAwardReceipt = (AwardReceipt)findAncestorWithClass(this, AwardReceipt.class);
			if (!theAwardReceipt.commitNeeded) {
				pageContext.getOut().print(theAwardReceipt.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AwardReceipt for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AwardReceipt for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			AwardReceipt theAwardReceipt = (AwardReceipt)findAncestorWithClass(this, AwardReceipt.class);
			return theAwardReceipt.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing AwardReceipt for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AwardReceipt for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			AwardReceipt theAwardReceipt = (AwardReceipt)findAncestorWithClass(this, AwardReceipt.class);
			theAwardReceipt.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing AwardReceipt for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AwardReceipt for label tag ");
		}
	}
}

