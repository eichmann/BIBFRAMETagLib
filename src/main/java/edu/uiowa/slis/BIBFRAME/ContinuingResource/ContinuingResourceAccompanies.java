package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceAccompanies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceAccompanies currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceAccompanies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceAccompaniesIterator theContinuingResourceAccompaniesIterator = (ContinuingResourceAccompaniesIterator)findAncestorWithClass(this, ContinuingResourceAccompaniesIterator.class);
			pageContext.getOut().print(theContinuingResourceAccompaniesIterator.getAccompanies());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

