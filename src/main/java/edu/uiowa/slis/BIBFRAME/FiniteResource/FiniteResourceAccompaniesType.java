package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceAccompaniesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceAccompaniesType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceAccompaniesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceAccompaniesIterator theFiniteResourceAccompaniesIterator = (FiniteResourceAccompaniesIterator)findAncestorWithClass(this, FiniteResourceAccompaniesIterator.class);
			pageContext.getOut().print(theFiniteResourceAccompaniesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

