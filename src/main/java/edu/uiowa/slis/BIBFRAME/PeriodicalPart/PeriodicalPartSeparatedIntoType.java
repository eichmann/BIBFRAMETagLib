package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartSeparatedIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartSeparatedIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartSeparatedIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartSeparatedIntoIterator thePeriodicalPartSeparatedIntoIterator = (PeriodicalPartSeparatedIntoIterator)findAncestorWithClass(this, PeriodicalPartSeparatedIntoIterator.class);
			pageContext.getOut().print(thePeriodicalPartSeparatedIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

