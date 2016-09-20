package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasPartIterator thePeriodicalHasPartIterator = (PeriodicalHasPartIterator)findAncestorWithClass(this, PeriodicalHasPartIterator.class);
			pageContext.getOut().print(thePeriodicalHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

