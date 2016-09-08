package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasOtherEdition extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalHasOtherEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasOtherEdition.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasOtherEditionIterator thePeriodicalHasOtherEditionIterator = (PeriodicalHasOtherEditionIterator)findAncestorWithClass(this, PeriodicalHasOtherEditionIterator.class);
			pageContext.getOut().print(thePeriodicalHasOtherEditionIterator.getHasOtherEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

