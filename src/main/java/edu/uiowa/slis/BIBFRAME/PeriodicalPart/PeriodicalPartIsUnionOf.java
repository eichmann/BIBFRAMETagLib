package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartIsUnionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartIsUnionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartIsUnionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartIsUnionOfIterator thePeriodicalPartIsUnionOfIterator = (PeriodicalPartIsUnionOfIterator)findAncestorWithClass(this, PeriodicalPartIsUnionOfIterator.class);
			pageContext.getOut().print(thePeriodicalPartIsUnionOfIterator.getIsUnionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

