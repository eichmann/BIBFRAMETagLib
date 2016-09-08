package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalSupplements extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalSupplements currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalSupplements.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalSupplementsIterator thePeriodicalSupplementsIterator = (PeriodicalSupplementsIterator)findAncestorWithClass(this, PeriodicalSupplementsIterator.class);
			pageContext.getOut().print(thePeriodicalSupplementsIterator.getSupplements());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for supplements tag ");
		}
		return SKIP_BODY;
	}
}

