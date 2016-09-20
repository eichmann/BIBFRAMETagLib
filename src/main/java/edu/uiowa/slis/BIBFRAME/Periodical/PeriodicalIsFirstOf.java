package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalIsFirstOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalIsFirstOf currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalIsFirstOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalIsFirstOfIterator thePeriodicalIsFirstOfIterator = (PeriodicalIsFirstOfIterator)findAncestorWithClass(this, PeriodicalIsFirstOfIterator.class);
			pageContext.getOut().print(thePeriodicalIsFirstOfIterator.getIsFirstOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

