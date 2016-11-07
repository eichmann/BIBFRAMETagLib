package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceHasExpression extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceHasExpression currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceHasExpression.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceHasExpressionIterator theContinuingResourceHasExpressionIterator = (ContinuingResourceHasExpressionIterator)findAncestorWithClass(this, ContinuingResourceHasExpressionIterator.class);
			pageContext.getOut().print(theContinuingResourceHasExpressionIterator.getHasExpression());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}
