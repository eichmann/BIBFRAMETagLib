package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileColorContent extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileColorContent currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileColorContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TactileColorContentIterator theTactile = (TactileColorContentIterator)findAncestorWithClass(this, TactileColorContentIterator.class);
			pageContext.getOut().print(theTactile.getColorContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for colorContent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for colorContent tag ");
		}
		return SKIP_BODY;
	}
}

