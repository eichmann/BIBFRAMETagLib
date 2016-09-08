package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartSplitInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartSplitInto currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartSplitInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartSplitIntoIterator thePeriodicalPartSplitIntoIterator = (PeriodicalPartSplitIntoIterator)findAncestorWithClass(this, PeriodicalPartSplitIntoIterator.class);
			pageContext.getOut().print(thePeriodicalPartSplitIntoIterator.getSplitInto());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

