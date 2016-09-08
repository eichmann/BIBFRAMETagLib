package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextHasExpressionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextHasExpressionType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextHasExpressionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextHasExpressionIterator theTextHasExpressionIterator = (TextHasExpressionIterator)findAncestorWithClass(this, TextHasExpressionIterator.class);
			pageContext.getOut().print(theTextHasExpressionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

