package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasAbsorbedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalHasAbsorbedType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasAbsorbedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasAbsorbedIterator thePeriodicalHasAbsorbedIterator = (PeriodicalHasAbsorbedIterator)findAncestorWithClass(this, PeriodicalHasAbsorbedIterator.class);
			pageContext.getOut().print(thePeriodicalHasAbsorbedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

