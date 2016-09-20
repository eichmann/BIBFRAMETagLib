package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartLanguageType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartLanguageType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartLanguageType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartLanguageIterator thePeriodicalPartLanguageIterator = (PeriodicalPartLanguageIterator)findAncestorWithClass(this, PeriodicalPartLanguageIterator.class);
			pageContext.getOut().print(thePeriodicalPartLanguageIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for language tag ");
		}
		return SKIP_BODY;
	}
}

