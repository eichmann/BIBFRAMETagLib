package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionIsExpressionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionIsExpressionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionIsExpressionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionIsExpressionOfIterator theCollectionIsExpressionOfIterator = (CollectionIsExpressionOfIterator)findAncestorWithClass(this, CollectionIsExpressionOfIterator.class);
			pageContext.getOut().print(theCollectionIsExpressionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

