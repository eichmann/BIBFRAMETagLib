package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasAbsorbed extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalHasAbsorbed currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasAbsorbed.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasAbsorbedIterator thePeriodicalHasAbsorbedIterator = (PeriodicalHasAbsorbedIterator)findAncestorWithClass(this, PeriodicalHasAbsorbedIterator.class);
			pageContext.getOut().print(thePeriodicalHasAbsorbedIterator.getHasAbsorbed());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

