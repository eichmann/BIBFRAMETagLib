package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartHasSupplement extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartHasSupplement currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartHasSupplement.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartHasSupplementIterator thePeriodicalPartHasSupplementIterator = (PeriodicalPartHasSupplementIterator)findAncestorWithClass(this, PeriodicalPartHasSupplementIterator.class);
			pageContext.getOut().print(thePeriodicalPartHasSupplementIterator.getHasSupplement());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

