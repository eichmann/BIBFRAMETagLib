package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalLanguage extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalLanguage currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalLanguage.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalLanguageIterator thePeriodicalLanguageIterator = (PeriodicalLanguageIterator)findAncestorWithClass(this, PeriodicalLanguageIterator.class);
			pageContext.getOut().print(thePeriodicalLanguageIterator.getLanguage());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for language tag ");
		}
		return SKIP_BODY;
	}
}

