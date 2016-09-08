package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartHasPartIterator thePeriodicalPartHasPartIterator = (PeriodicalPartHasPartIterator)findAncestorWithClass(this, PeriodicalPartHasPartIterator.class);
			pageContext.getOut().print(thePeriodicalPartHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

