package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartTranslatedAsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartTranslatedAsType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartTranslatedAsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartTranslatedAsIterator thePeriodicalPartTranslatedAsIterator = (PeriodicalPartTranslatedAsIterator)findAncestorWithClass(this, PeriodicalPartTranslatedAsIterator.class);
			pageContext.getOut().print(thePeriodicalPartTranslatedAsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

