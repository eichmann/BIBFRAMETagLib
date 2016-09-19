package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPrecedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPrecedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPrecedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPrecedesIterator thePeriodicalPrecedesIterator = (PeriodicalPrecedesIterator)findAncestorWithClass(this, PeriodicalPrecedesIterator.class);
			pageContext.getOut().print(thePeriodicalPrecedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for precedes tag ");
		}
		return SKIP_BODY;
	}
}

