package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalIsUnionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalIsUnionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalIsUnionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalIsUnionOfIterator thePeriodicalIsUnionOfIterator = (PeriodicalIsUnionOfIterator)findAncestorWithClass(this, PeriodicalIsUnionOfIterator.class);
			pageContext.getOut().print(thePeriodicalIsUnionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

