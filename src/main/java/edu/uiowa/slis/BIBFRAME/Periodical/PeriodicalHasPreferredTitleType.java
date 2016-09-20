package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasPreferredTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalHasPreferredTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasPreferredTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasPreferredTitleIterator thePeriodicalHasPreferredTitleIterator = (PeriodicalHasPreferredTitleIterator)findAncestorWithClass(this, PeriodicalHasPreferredTitleIterator.class);
			pageContext.getOut().print(thePeriodicalHasPreferredTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

