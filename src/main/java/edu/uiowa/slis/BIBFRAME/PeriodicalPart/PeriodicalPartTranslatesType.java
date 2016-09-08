package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartTranslatesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartTranslatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartTranslatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartTranslatesIterator thePeriodicalPartTranslatesIterator = (PeriodicalPartTranslatesIterator)findAncestorWithClass(this, PeriodicalPartTranslatesIterator.class);
			pageContext.getOut().print(thePeriodicalPartTranslatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for translates tag ");
		}
		return SKIP_BODY;
	}
}

