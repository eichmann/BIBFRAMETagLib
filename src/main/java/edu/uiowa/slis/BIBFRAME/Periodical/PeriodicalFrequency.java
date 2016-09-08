package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalFrequency extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalFrequency currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalFrequency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalFrequencyIterator thePeriodical = (PeriodicalFrequencyIterator)findAncestorWithClass(this, PeriodicalFrequencyIterator.class);
			pageContext.getOut().print(thePeriodical.getFrequency());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for frequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for frequency tag ");
		}
		return SKIP_BODY;
	}
}

