package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartFrequency extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartFrequency currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartFrequency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartFrequencyIterator thePeriodicalPart = (PeriodicalPartFrequencyIterator)findAncestorWithClass(this, PeriodicalPartFrequencyIterator.class);
			pageContext.getOut().print(thePeriodicalPart.getFrequency());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for frequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for frequency tag ");
		}
		return SKIP_BODY;
	}
}

