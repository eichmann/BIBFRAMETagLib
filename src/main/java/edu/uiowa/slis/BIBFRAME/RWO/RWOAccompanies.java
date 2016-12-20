package edu.uiowa.slis.BIBFRAME.RWO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RWOAccompanies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RWOAccompanies currentInstance = null;
	private static final Log log = LogFactory.getLog(RWOAccompanies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RWOAccompaniesIterator theRWOAccompaniesIterator = (RWOAccompaniesIterator)findAncestorWithClass(this, RWOAccompaniesIterator.class);
			pageContext.getOut().print(theRWOAccompaniesIterator.getAccompanies());
		} catch (Exception e) {
			log.error("Can't find enclosing RWO for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing RWO for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

