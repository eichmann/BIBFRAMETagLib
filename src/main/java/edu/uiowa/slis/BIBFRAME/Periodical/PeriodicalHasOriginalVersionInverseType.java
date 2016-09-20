package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalHasOriginalVersionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalHasOriginalVersionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalHasOriginalVersionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalHasOriginalVersionInverseIterator thePeriodicalHasOriginalVersionInverseIterator = (PeriodicalHasOriginalVersionInverseIterator)findAncestorWithClass(this, PeriodicalHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(thePeriodicalHasOriginalVersionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

