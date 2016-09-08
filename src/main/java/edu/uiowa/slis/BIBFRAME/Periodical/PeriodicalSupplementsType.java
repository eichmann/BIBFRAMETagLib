package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalSupplementsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalSupplementsType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalSupplementsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalSupplementsIterator thePeriodicalSupplementsIterator = (PeriodicalSupplementsIterator)findAncestorWithClass(this, PeriodicalSupplementsIterator.class);
			pageContext.getOut().print(thePeriodicalSupplementsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for supplements tag ");
		}
		return SKIP_BODY;
	}
}

