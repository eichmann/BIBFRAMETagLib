package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalAccompaniedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalAccompaniedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalAccompaniedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalAccompaniedByIterator thePeriodicalAccompaniedByIterator = (PeriodicalAccompaniedByIterator)findAncestorWithClass(this, PeriodicalAccompaniedByIterator.class);
			pageContext.getOut().print(thePeriodicalAccompaniedByIterator.getAccompaniedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}
