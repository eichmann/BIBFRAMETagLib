package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartHasOtherEditionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartHasOtherEditionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartHasOtherEditionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartHasOtherEditionInverseIterator thePeriodicalPartHasOtherEditionInverseIterator = (PeriodicalPartHasOtherEditionInverseIterator)findAncestorWithClass(this, PeriodicalPartHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(thePeriodicalPartHasOtherEditionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

