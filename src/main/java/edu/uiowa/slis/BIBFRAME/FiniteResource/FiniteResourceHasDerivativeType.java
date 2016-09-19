package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceHasDerivativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceHasDerivativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceHasDerivativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceHasDerivativeIterator theFiniteResourceHasDerivativeIterator = (FiniteResourceHasDerivativeIterator)findAncestorWithClass(this, FiniteResourceHasDerivativeIterator.class);
			pageContext.getOut().print(theFiniteResourceHasDerivativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

