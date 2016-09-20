package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartHasOtherEdition extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartHasOtherEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartHasOtherEdition.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartHasOtherEditionIterator thePeriodicalPartHasOtherEditionIterator = (PeriodicalPartHasOtherEditionIterator)findAncestorWithClass(this, PeriodicalPartHasOtherEditionIterator.class);
			pageContext.getOut().print(thePeriodicalPartHasOtherEditionIterator.getHasOtherEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

