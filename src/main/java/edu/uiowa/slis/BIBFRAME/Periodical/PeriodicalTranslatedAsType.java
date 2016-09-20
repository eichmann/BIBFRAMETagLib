package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalTranslatedAsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalTranslatedAsType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalTranslatedAsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalTranslatedAsIterator thePeriodicalTranslatedAsIterator = (PeriodicalTranslatedAsIterator)findAncestorWithClass(this, PeriodicalTranslatedAsIterator.class);
			pageContext.getOut().print(thePeriodicalTranslatedAsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

