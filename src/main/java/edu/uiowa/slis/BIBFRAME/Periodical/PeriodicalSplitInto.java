package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalSplitInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalSplitInto currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalSplitInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalSplitIntoIterator thePeriodicalSplitIntoIterator = (PeriodicalSplitIntoIterator)findAncestorWithClass(this, PeriodicalSplitIntoIterator.class);
			pageContext.getOut().print(thePeriodicalSplitIntoIterator.getSplitInto());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for splitInto tag ");
		}
		return SKIP_BODY;
	}
}
