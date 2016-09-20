package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalIsLastOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalIsLastOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalIsLastOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalIsLastOfIterator thePeriodicalIsLastOfIterator = (PeriodicalIsLastOfIterator)findAncestorWithClass(this, PeriodicalIsLastOfIterator.class);
			pageContext.getOut().print(thePeriodicalIsLastOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

