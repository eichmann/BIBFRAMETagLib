package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalAgentInverseIterator thePeriodicalAgentInverseIterator = (PeriodicalAgentInverseIterator)findAncestorWithClass(this, PeriodicalAgentInverseIterator.class);
			pageContext.getOut().print(thePeriodicalAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for agent tag ");
		}
		return SKIP_BODY;
	}
}
