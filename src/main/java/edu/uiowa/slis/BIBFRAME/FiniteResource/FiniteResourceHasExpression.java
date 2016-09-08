package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceHasExpression extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceHasExpression currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceHasExpression.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceHasExpressionIterator theFiniteResourceHasExpressionIterator = (FiniteResourceHasExpressionIterator)findAncestorWithClass(this, FiniteResourceHasExpressionIterator.class);
			pageContext.getOut().print(theFiniteResourceHasExpressionIterator.getHasExpression());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

