package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPrecedesIterator thePeriodicalPrecedesIterator = (PeriodicalPrecedesIterator)findAncestorWithClass(this, PeriodicalPrecedesIterator.class);
			pageContext.getOut().print(thePeriodicalPrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for precedes tag ");
		}
		return SKIP_BODY;
	}
}

