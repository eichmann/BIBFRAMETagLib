package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileHasHolding extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileHasHolding currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileHasHolding.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TactileHasHoldingIterator theTactileHasHoldingIterator = (TactileHasHoldingIterator)findAncestorWithClass(this, TactileHasHoldingIterator.class);
			pageContext.getOut().print(theTactileHasHoldingIterator.getHasHolding());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for hasHolding tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for hasHolding tag ");
		}
		return SKIP_BODY;
	}
}

