package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasTitleIterator thePeriodicalHasTitleIterator = (PeriodicalHasTitleIterator)findAncestorWithClass(this, PeriodicalHasTitleIterator.class);
			pageContext.getOut().print(thePeriodicalHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

