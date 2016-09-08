package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartIdentifiedByIterator thePeriodicalPartIdentifiedByIterator = (PeriodicalPartIdentifiedByIterator)findAncestorWithClass(this, PeriodicalPartIdentifiedByIterator.class);
			pageContext.getOut().print(thePeriodicalPartIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

