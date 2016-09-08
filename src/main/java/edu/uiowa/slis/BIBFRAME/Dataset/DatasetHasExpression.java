package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasExpression extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetHasExpression currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasExpression.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasExpressionIterator theDatasetHasExpressionIterator = (DatasetHasExpressionIterator)findAncestorWithClass(this, DatasetHasExpressionIterator.class);
			pageContext.getOut().print(theDatasetHasExpressionIterator.getHasExpression());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

