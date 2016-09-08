package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasOriginalVersionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalHasOriginalVersionType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasOriginalVersionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasOriginalVersionIterator thePeriodicalHasOriginalVersionIterator = (PeriodicalHasOriginalVersionIterator)findAncestorWithClass(this, PeriodicalHasOriginalVersionIterator.class);
			pageContext.getOut().print(thePeriodicalHasOriginalVersionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

