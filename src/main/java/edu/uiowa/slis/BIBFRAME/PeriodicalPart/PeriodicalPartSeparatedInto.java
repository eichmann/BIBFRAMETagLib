package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartSeparatedInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartSeparatedInto currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartSeparatedInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartSeparatedIntoIterator thePeriodicalPartSeparatedIntoIterator = (PeriodicalPartSeparatedIntoIterator)findAncestorWithClass(this, PeriodicalPartSeparatedIntoIterator.class);
			pageContext.getOut().print(thePeriodicalPartSeparatedIntoIterator.getSeparatedInto());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

