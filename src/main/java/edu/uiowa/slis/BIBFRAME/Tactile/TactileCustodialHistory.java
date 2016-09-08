package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileCustodialHistory extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileCustodialHistory currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileCustodialHistory.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TactileCustodialHistoryIterator theTactile = (TactileCustodialHistoryIterator)findAncestorWithClass(this, TactileCustodialHistoryIterator.class);
			pageContext.getOut().print(theTactile.getCustodialHistory());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for custodialHistory tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for custodialHistory tag ");
		}
		return SKIP_BODY;
	}
}

