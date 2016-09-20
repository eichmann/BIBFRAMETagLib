package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationAccompanies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationAccompanies currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationAccompanies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationAccompaniesIterator theDissertationAccompaniesIterator = (DissertationAccompaniesIterator)findAncestorWithClass(this, DissertationAccompaniesIterator.class);
			pageContext.getOut().print(theDissertationAccompaniesIterator.getAccompanies());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

