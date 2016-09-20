package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalIsFindingAidFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalIsFindingAidFor currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalIsFindingAidFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalIsFindingAidForIterator thePeriodicalIsFindingAidForIterator = (PeriodicalIsFindingAidForIterator)findAncestorWithClass(this, PeriodicalIsFindingAidForIterator.class);
			pageContext.getOut().print(thePeriodicalIsFindingAidForIterator.getIsFindingAidFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

