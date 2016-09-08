package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileDuration extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileDuration currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileDuration.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TactileDurationIterator theTactile = (TactileDurationIterator)findAncestorWithClass(this, TactileDurationIterator.class);
			pageContext.getOut().print(theTactile.getDuration());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for duration tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for duration tag ");
		}
		return SKIP_BODY;
	}
}

