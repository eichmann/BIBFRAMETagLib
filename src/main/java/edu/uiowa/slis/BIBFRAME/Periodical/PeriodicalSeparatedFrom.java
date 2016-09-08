package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalSeparatedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalSeparatedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalSeparatedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalSeparatedFromIterator thePeriodicalSeparatedFromIterator = (PeriodicalSeparatedFromIterator)findAncestorWithClass(this, PeriodicalSeparatedFromIterator.class);
			pageContext.getOut().print(thePeriodicalSeparatedFromIterator.getSeparatedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

