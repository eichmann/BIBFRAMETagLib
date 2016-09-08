package edu.uiowa.slis.BIBFRAME.LegalDepositNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDepositNumberLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LegalDepositNumberLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDepositNumberLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LegalDepositNumber theLegalDepositNumber = (LegalDepositNumber)findAncestorWithClass(this, LegalDepositNumber.class);
			if (!theLegalDepositNumber.commitNeeded) {
				pageContext.getOut().print(theLegalDepositNumber.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDepositNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDepositNumber for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			LegalDepositNumber theLegalDepositNumber = (LegalDepositNumber)findAncestorWithClass(this, LegalDepositNumber.class);
			return theLegalDepositNumber.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing LegalDepositNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDepositNumber for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			LegalDepositNumber theLegalDepositNumber = (LegalDepositNumber)findAncestorWithClass(this, LegalDepositNumber.class);
			theLegalDepositNumber.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDepositNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDepositNumber for label tag ");
		}
	}
}

