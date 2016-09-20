package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartAccompanies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartAccompanies currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartAccompanies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartAccompaniesIterator thePeriodicalPartAccompaniesIterator = (PeriodicalPartAccompaniesIterator)findAncestorWithClass(this, PeriodicalPartAccompaniesIterator.class);
			pageContext.getOut().print(thePeriodicalPartAccompaniesIterator.getAccompanies());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

