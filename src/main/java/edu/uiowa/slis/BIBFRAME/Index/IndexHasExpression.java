package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexHasExpression extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexHasExpression currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexHasExpression.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexHasExpressionIterator theIndexHasExpressionIterator = (IndexHasExpressionIterator)findAncestorWithClass(this, IndexHasExpressionIterator.class);
			pageContext.getOut().print(theIndexHasExpressionIterator.getHasExpression());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

