package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicHasHoldingType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicHasHoldingType currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicHasHoldingType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ElectronicHasHoldingIterator theElectronicHasHoldingIterator = (ElectronicHasHoldingIterator)findAncestorWithClass(this, ElectronicHasHoldingIterator.class);
			pageContext.getOut().print(theElectronicHasHoldingIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for hasHolding tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for hasHolding tag ");
		}
		return SKIP_BODY;
	}
}

