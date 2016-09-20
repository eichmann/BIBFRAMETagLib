package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalAccompaniesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalAccompaniesType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalAccompaniesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeriodicalAccompaniesIterator thePeriodicalAccompaniesIterator = (PeriodicalAccompaniesIterator)findAncestorWithClass(this, PeriodicalAccompaniesIterator.class);
			pageContext.getOut().print(thePeriodicalAccompaniesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

