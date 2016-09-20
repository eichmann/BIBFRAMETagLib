package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalAbsorbedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalAbsorbedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalAbsorbedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalAbsorbedByIterator thePeriodicalAbsorbedByIterator = (PeriodicalAbsorbedByIterator)findAncestorWithClass(this, PeriodicalAbsorbedByIterator.class);
			pageContext.getOut().print(thePeriodicalAbsorbedByIterator.getAbsorbedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

