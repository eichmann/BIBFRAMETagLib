package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasTitleIterator thePeriodicalHasTitleIterator = (PeriodicalHasTitleIterator)findAncestorWithClass(this, PeriodicalHasTitleIterator.class);
			pageContext.getOut().print(thePeriodicalHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

