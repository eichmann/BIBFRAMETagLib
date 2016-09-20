package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartHasTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartHasTitleIterator thePeriodicalPartHasTitleIterator = (PeriodicalPartHasTitleIterator)findAncestorWithClass(this, PeriodicalPartHasTitleIterator.class);
			pageContext.getOut().print(thePeriodicalPartHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

