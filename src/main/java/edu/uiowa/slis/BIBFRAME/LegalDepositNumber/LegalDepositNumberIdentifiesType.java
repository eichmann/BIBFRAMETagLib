package edu.uiowa.slis.BIBFRAME.LegalDepositNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDepositNumberIdentifiesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LegalDepositNumberIdentifiesType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDepositNumberIdentifiesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDepositNumberIdentifiesIterator theLegalDepositNumberIdentifiesIterator = (LegalDepositNumberIdentifiesIterator)findAncestorWithClass(this, LegalDepositNumberIdentifiesIterator.class);
			pageContext.getOut().print(theLegalDepositNumberIdentifiesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDepositNumber for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDepositNumber for identifies tag ");
		}
		return SKIP_BODY;
	}
}

