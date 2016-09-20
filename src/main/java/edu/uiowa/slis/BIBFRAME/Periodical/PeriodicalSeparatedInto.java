package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalSeparatedInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalSeparatedInto currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalSeparatedInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalSeparatedIntoIterator thePeriodicalSeparatedIntoIterator = (PeriodicalSeparatedIntoIterator)findAncestorWithClass(this, PeriodicalSeparatedIntoIterator.class);
			pageContext.getOut().print(thePeriodicalSeparatedIntoIterator.getSeparatedInto());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

