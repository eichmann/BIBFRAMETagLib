package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasOtherEditionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalHasOtherEditionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasOtherEditionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasOtherEditionInverseIterator thePeriodicalHasOtherEditionInverseIterator = (PeriodicalHasOtherEditionInverseIterator)findAncestorWithClass(this, PeriodicalHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(thePeriodicalHasOtherEditionInverseIterator.getHasOtherEditionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

