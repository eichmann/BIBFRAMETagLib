package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventAccompanies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EventAccompanies currentInstance = null;
	private static final Log log = LogFactory.getLog(EventAccompanies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventAccompaniesIterator theEventAccompaniesIterator = (EventAccompaniesIterator)findAncestorWithClass(this, EventAccompaniesIterator.class);
			pageContext.getOut().print(theEventAccompaniesIterator.getAccompanies());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

