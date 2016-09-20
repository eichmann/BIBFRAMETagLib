package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalIsPartOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalIsPartOf currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalIsPartOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalIsPartOfIterator thePeriodicalIsPartOfIterator = (PeriodicalIsPartOfIterator)findAncestorWithClass(this, PeriodicalIsPartOfIterator.class);
			pageContext.getOut().print(thePeriodicalIsPartOfIterator.getIsPartOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

