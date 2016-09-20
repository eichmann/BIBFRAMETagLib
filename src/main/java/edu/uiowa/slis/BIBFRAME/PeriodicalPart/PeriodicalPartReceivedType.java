package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartReceivedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartReceivedType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartReceivedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartReceivedIterator thePeriodicalPartReceivedIterator = (PeriodicalPartReceivedIterator)findAncestorWithClass(this, PeriodicalPartReceivedIterator.class);
			pageContext.getOut().print(thePeriodicalPartReceivedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for received tag ");
		}
		return SKIP_BODY;
	}
}

