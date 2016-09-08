package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasFindingAidType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalHasFindingAidType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasFindingAidType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasFindingAidIterator thePeriodicalHasFindingAidIterator = (PeriodicalHasFindingAidIterator)findAncestorWithClass(this, PeriodicalHasFindingAidIterator.class);
			pageContext.getOut().print(thePeriodicalHasFindingAidIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}

