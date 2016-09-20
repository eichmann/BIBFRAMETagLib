package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartSupplementsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartSupplementsType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartSupplementsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartSupplementsIterator thePeriodicalPartSupplementsIterator = (PeriodicalPartSupplementsIterator)findAncestorWithClass(this, PeriodicalPartSupplementsIterator.class);
			pageContext.getOut().print(thePeriodicalPartSupplementsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for supplements tag ");
		}
		return SKIP_BODY;
	}
}

