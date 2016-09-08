package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasExpressionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionHasExpressionType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasExpressionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasExpressionIterator theCollectionHasExpressionIterator = (CollectionHasExpressionIterator)findAncestorWithClass(this, CollectionHasExpressionIterator.class);
			pageContext.getOut().print(theCollectionHasExpressionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

