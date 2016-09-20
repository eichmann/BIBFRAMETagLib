package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartHasPreferredTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartHasPreferredTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartHasPreferredTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartHasPreferredTitleIterator thePeriodicalPartHasPreferredTitleIterator = (PeriodicalPartHasPreferredTitleIterator)findAncestorWithClass(this, PeriodicalPartHasPreferredTitleIterator.class);
			pageContext.getOut().print(thePeriodicalPartHasPreferredTitleIterator.getHasPreferredTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

