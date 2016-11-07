package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasLastType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalHasLastType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasLastType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasLastIterator thePeriodicalHasLastIterator = (PeriodicalHasLastIterator)findAncestorWithClass(this, PeriodicalHasLastIterator.class);
			pageContext.getOut().print(thePeriodicalHasLastIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasLast tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasLast tag ");
		}
		return SKIP_BODY;
	}
}
