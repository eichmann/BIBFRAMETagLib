package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalFollows extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalFollows currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalFollows.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalFollowsIterator thePeriodicalFollowsIterator = (PeriodicalFollowsIterator)findAncestorWithClass(this, PeriodicalFollowsIterator.class);
			pageContext.getOut().print(thePeriodicalFollowsIterator.getFollows());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for follows tag ");
		}
		return SKIP_BODY;
	}
}

