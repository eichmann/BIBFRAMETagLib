package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartProducedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartProducedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartProducedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartProducedAtIterator thePeriodicalPartProducedAtIterator = (PeriodicalPartProducedAtIterator)findAncestorWithClass(this, PeriodicalPartProducedAtIterator.class);
			pageContext.getOut().print(thePeriodicalPartProducedAtIterator.getProducedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for producedAt tag ");
		}
		return SKIP_BODY;
	}
}

