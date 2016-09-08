package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileNotationSystem extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileNotationSystem currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileNotationSystem.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TactileNotationSystemIterator theTactile = (TactileNotationSystemIterator)findAncestorWithClass(this, TactileNotationSystemIterator.class);
			pageContext.getOut().print(theTactile.getNotationSystem());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for notationSystem tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for notationSystem tag ");
		}
		return SKIP_BODY;
	}
}

