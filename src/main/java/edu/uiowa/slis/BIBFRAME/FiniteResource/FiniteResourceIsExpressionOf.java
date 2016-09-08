package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceIsExpressionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceIsExpressionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceIsExpressionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceIsExpressionOfIterator theFiniteResourceIsExpressionOfIterator = (FiniteResourceIsExpressionOfIterator)findAncestorWithClass(this, FiniteResourceIsExpressionOfIterator.class);
			pageContext.getOut().print(theFiniteResourceIsExpressionOfIterator.getIsExpressionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

