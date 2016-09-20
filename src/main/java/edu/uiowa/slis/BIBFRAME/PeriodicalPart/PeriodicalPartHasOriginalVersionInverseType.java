package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartHasOriginalVersionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartHasOriginalVersionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartHasOriginalVersionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartHasOriginalVersionInverseIterator thePeriodicalPartHasOriginalVersionInverseIterator = (PeriodicalPartHasOriginalVersionInverseIterator)findAncestorWithClass(this, PeriodicalPartHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(thePeriodicalPartHasOriginalVersionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

