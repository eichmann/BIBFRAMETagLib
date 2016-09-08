package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartHasInstance extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartHasInstance currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartHasInstance.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartHasInstanceIterator thePeriodicalPartHasInstanceIterator = (PeriodicalPartHasInstanceIterator)findAncestorWithClass(this, PeriodicalPartHasInstanceIterator.class);
			pageContext.getOut().print(thePeriodicalPartHasInstanceIterator.getHasInstance());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

