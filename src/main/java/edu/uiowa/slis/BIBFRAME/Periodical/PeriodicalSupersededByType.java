package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalSupersededByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalSupersededByType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalSupersededByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalSupersededByIterator thePeriodicalSupersededByIterator = (PeriodicalSupersededByIterator)findAncestorWithClass(this, PeriodicalSupersededByIterator.class);
			pageContext.getOut().print(thePeriodicalSupersededByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

