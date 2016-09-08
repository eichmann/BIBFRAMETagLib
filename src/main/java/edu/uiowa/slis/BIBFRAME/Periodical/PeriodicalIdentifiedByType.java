package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalIdentifiedByIterator thePeriodicalIdentifiedByIterator = (PeriodicalIdentifiedByIterator)findAncestorWithClass(this, PeriodicalIdentifiedByIterator.class);
			pageContext.getOut().print(thePeriodicalIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

