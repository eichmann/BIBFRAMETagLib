package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasSupplement extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalHasSupplement currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasSupplement.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasSupplementIterator thePeriodicalHasSupplementIterator = (PeriodicalHasSupplementIterator)findAncestorWithClass(this, PeriodicalHasSupplementIterator.class);
			pageContext.getOut().print(thePeriodicalHasSupplementIterator.getHasSupplement());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

