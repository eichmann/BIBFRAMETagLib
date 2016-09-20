package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalSeparatedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalSeparatedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalSeparatedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalSeparatedFromIterator thePeriodicalSeparatedFromIterator = (PeriodicalSeparatedFromIterator)findAncestorWithClass(this, PeriodicalSeparatedFromIterator.class);
			pageContext.getOut().print(thePeriodicalSeparatedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

