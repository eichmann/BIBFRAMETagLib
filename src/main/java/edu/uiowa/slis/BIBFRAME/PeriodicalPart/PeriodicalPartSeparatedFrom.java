package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartSeparatedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartSeparatedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartSeparatedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartSeparatedFromIterator thePeriodicalPartSeparatedFromIterator = (PeriodicalPartSeparatedFromIterator)findAncestorWithClass(this, PeriodicalPartSeparatedFromIterator.class);
			pageContext.getOut().print(thePeriodicalPartSeparatedFromIterator.getSeparatedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

