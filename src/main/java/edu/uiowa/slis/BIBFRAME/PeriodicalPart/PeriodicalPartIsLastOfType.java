package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartIsLastOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartIsLastOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartIsLastOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartIsLastOfIterator thePeriodicalPartIsLastOfIterator = (PeriodicalPartIsLastOfIterator)findAncestorWithClass(this, PeriodicalPartIsLastOfIterator.class);
			pageContext.getOut().print(thePeriodicalPartIsLastOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

