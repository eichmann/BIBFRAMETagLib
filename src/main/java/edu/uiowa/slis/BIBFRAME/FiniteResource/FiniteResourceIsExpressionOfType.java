package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceIsExpressionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceIsExpressionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceIsExpressionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceIsExpressionOfIterator theFiniteResourceIsExpressionOfIterator = (FiniteResourceIsExpressionOfIterator)findAncestorWithClass(this, FiniteResourceIsExpressionOfIterator.class);
			pageContext.getOut().print(theFiniteResourceIsExpressionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

