package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasInstance extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalHasInstance currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasInstance.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasInstanceIterator thePeriodicalHasInstanceIterator = (PeriodicalHasInstanceIterator)findAncestorWithClass(this, PeriodicalHasInstanceIterator.class);
			pageContext.getOut().print(thePeriodicalHasInstanceIterator.getHasInstance());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

