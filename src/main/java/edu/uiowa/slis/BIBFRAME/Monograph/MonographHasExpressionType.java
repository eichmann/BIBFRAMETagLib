package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographHasExpressionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographHasExpressionType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographHasExpressionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographHasExpressionIterator theMonographHasExpressionIterator = (MonographHasExpressionIterator)findAncestorWithClass(this, MonographHasExpressionIterator.class);
			pageContext.getOut().print(theMonographHasExpressionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

