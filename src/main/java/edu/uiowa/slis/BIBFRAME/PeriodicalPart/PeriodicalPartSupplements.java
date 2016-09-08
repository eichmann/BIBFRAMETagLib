package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartSupplements extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartSupplements currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartSupplements.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartSupplementsIterator thePeriodicalPartSupplementsIterator = (PeriodicalPartSupplementsIterator)findAncestorWithClass(this, PeriodicalPartSupplementsIterator.class);
			pageContext.getOut().print(thePeriodicalPartSupplementsIterator.getSupplements());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for supplements tag ");
		}
		return SKIP_BODY;
	}
}

