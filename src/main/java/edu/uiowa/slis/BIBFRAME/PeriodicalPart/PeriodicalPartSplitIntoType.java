package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartSplitIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartSplitIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartSplitIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartSplitIntoIterator thePeriodicalPartSplitIntoIterator = (PeriodicalPartSplitIntoIterator)findAncestorWithClass(this, PeriodicalPartSplitIntoIterator.class);
			pageContext.getOut().print(thePeriodicalPartSplitIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

