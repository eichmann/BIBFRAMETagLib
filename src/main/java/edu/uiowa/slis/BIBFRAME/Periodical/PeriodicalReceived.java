package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalReceived extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalReceived currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalReceived.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalReceivedIterator thePeriodicalReceivedIterator = (PeriodicalReceivedIterator)findAncestorWithClass(this, PeriodicalReceivedIterator.class);
			pageContext.getOut().print(thePeriodicalReceivedIterator.getReceived());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for received tag ");
		}
		return SKIP_BODY;
	}
}

