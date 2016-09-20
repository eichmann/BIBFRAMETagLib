package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHasExpressionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperHasExpressionType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHasExpressionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperHasExpressionIterator theNewspaperHasExpressionIterator = (NewspaperHasExpressionIterator)findAncestorWithClass(this, NewspaperHasExpressionIterator.class);
			pageContext.getOut().print(theNewspaperHasExpressionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

