package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartFollows extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartFollows currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartFollows.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartFollowsIterator thePeriodicalPartFollowsIterator = (PeriodicalPartFollowsIterator)findAncestorWithClass(this, PeriodicalPartFollowsIterator.class);
			pageContext.getOut().print(thePeriodicalPartFollowsIterator.getFollows());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for follows tag ");
		}
		return SKIP_BODY;
	}
}

