package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceHasHolding extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceHasHolding currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceHasHolding.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceHasHoldingIterator theInstanceHasHoldingIterator = (InstanceHasHoldingIterator)findAncestorWithClass(this, InstanceHasHoldingIterator.class);
			pageContext.getOut().print(theInstanceHasHoldingIterator.getHasHolding());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for hasHolding tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for hasHolding tag ");
		}
		return SKIP_BODY;
	}
}

