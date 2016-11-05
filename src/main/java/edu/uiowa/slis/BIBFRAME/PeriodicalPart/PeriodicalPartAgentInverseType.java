package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartAgentInverseIterator thePeriodicalPartAgentInverseIterator = (PeriodicalPartAgentInverseIterator)findAncestorWithClass(this, PeriodicalPartAgentInverseIterator.class);
			pageContext.getOut().print(thePeriodicalPartAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for agent tag ");
		}
		return SKIP_BODY;
	}
}

