package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceHasDerivative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceHasDerivative currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceHasDerivative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceHasDerivativeIterator theContinuingResourceHasDerivativeIterator = (ContinuingResourceHasDerivativeIterator)findAncestorWithClass(this, ContinuingResourceHasDerivativeIterator.class);
			pageContext.getOut().print(theContinuingResourceHasDerivativeIterator.getHasDerivative());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

