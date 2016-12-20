package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingAccompanies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingAccompanies currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingAccompanies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingAccompaniesIterator theThingAccompaniesIterator = (ThingAccompaniesIterator)findAncestorWithClass(this, ThingAccompaniesIterator.class);
			pageContext.getOut().print(theThingAccompaniesIterator.getAccompanies());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

