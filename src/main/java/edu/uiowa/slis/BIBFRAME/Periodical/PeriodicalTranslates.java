package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalTranslates extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalTranslates currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalTranslates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalTranslatesIterator thePeriodicalTranslatesIterator = (PeriodicalTranslatesIterator)findAncestorWithClass(this, PeriodicalTranslatesIterator.class);
			pageContext.getOut().print(thePeriodicalTranslatesIterator.getTranslates());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for translates tag ");
		}
		return SKIP_BODY;
	}
}

