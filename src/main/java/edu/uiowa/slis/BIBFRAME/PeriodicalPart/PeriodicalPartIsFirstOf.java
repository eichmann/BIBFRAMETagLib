package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartIsFirstOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartIsFirstOf currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartIsFirstOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartIsFirstOfIterator thePeriodicalPartIsFirstOfIterator = (PeriodicalPartIsFirstOfIterator)findAncestorWithClass(this, PeriodicalPartIsFirstOfIterator.class);
			pageContext.getOut().print(thePeriodicalPartIsFirstOfIterator.getIsFirstOf());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

