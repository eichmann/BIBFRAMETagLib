package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalProducedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalProducedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalProducedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalProducedAtIterator thePeriodicalProducedAtIterator = (PeriodicalProducedAtIterator)findAncestorWithClass(this, PeriodicalProducedAtIterator.class);
			pageContext.getOut().print(thePeriodicalProducedAtIterator.getProducedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for producedAt tag ");
		}
		return SKIP_BODY;
	}
}

