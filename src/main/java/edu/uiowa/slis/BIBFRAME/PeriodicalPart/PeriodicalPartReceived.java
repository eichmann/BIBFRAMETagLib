package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartReceived extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartReceived currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartReceived.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartReceivedIterator thePeriodicalPartReceivedIterator = (PeriodicalPartReceivedIterator)findAncestorWithClass(this, PeriodicalPartReceivedIterator.class);
			pageContext.getOut().print(thePeriodicalPartReceivedIterator.getReceived());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for received tag ");
		}
		return SKIP_BODY;
	}
}

