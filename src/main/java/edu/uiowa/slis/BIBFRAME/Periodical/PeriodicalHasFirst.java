package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasFirst extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalHasFirst currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasFirst.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasFirstIterator thePeriodicalHasFirstIterator = (PeriodicalHasFirstIterator)findAncestorWithClass(this, PeriodicalHasFirstIterator.class);
			pageContext.getOut().print(thePeriodicalHasFirstIterator.getHasFirst());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasFirst tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasFirst tag ");
		}
		return SKIP_BODY;
	}
}

