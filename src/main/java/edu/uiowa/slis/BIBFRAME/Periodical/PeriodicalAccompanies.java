package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalAccompanies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalAccompanies currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalAccompanies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalAccompaniesIterator thePeriodicalAccompaniesIterator = (PeriodicalAccompaniesIterator)findAncestorWithClass(this, PeriodicalAccompaniesIterator.class);
			pageContext.getOut().print(thePeriodicalAccompaniesIterator.getAccompanies());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

