package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasFindingAid extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalHasFindingAid currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasFindingAid.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasFindingAidIterator thePeriodicalHasFindingAidIterator = (PeriodicalHasFindingAidIterator)findAncestorWithClass(this, PeriodicalHasFindingAidIterator.class);
			pageContext.getOut().print(thePeriodicalHasFindingAidIterator.getHasFindingAid());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}

