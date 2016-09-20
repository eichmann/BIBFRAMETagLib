package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartSupersededByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartSupersededByType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartSupersededByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartSupersededByIterator thePeriodicalPartSupersededByIterator = (PeriodicalPartSupersededByIterator)findAncestorWithClass(this, PeriodicalPartSupersededByIterator.class);
			pageContext.getOut().print(thePeriodicalPartSupersededByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

