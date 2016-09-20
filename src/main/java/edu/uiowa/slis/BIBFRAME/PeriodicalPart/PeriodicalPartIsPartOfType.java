package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartIsPartOfIterator thePeriodicalPartIsPartOfIterator = (PeriodicalPartIsPartOfIterator)findAncestorWithClass(this, PeriodicalPartIsPartOfIterator.class);
			pageContext.getOut().print(thePeriodicalPartIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

