package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceHasDerivative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceHasDerivative currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceHasDerivative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceHasDerivativeIterator theFiniteResourceHasDerivativeIterator = (FiniteResourceHasDerivativeIterator)findAncestorWithClass(this, FiniteResourceHasDerivativeIterator.class);
			pageContext.getOut().print(theFiniteResourceHasDerivativeIterator.getHasDerivative());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

