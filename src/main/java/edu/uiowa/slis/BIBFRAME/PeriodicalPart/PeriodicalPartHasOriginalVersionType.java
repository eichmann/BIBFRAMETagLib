package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartHasOriginalVersionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartHasOriginalVersionType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartHasOriginalVersionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartHasOriginalVersionIterator thePeriodicalPartHasOriginalVersionIterator = (PeriodicalPartHasOriginalVersionIterator)findAncestorWithClass(this, PeriodicalPartHasOriginalVersionIterator.class);
			pageContext.getOut().print(thePeriodicalPartHasOriginalVersionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

