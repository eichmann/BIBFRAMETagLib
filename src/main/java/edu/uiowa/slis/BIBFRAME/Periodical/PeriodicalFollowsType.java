package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalFollowsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalFollowsType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalFollowsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalFollowsIterator thePeriodicalFollowsIterator = (PeriodicalFollowsIterator)findAncestorWithClass(this, PeriodicalFollowsIterator.class);
			pageContext.getOut().print(thePeriodicalFollowsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for follows tag ");
		}
		return SKIP_BODY;
	}
}

