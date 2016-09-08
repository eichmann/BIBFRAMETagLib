package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextHasExpression extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextHasExpression currentInstance = null;
	private static final Log log = LogFactory.getLog(TextHasExpression.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextHasExpressionIterator theTextHasExpressionIterator = (TextHasExpressionIterator)findAncestorWithClass(this, TextHasExpressionIterator.class);
			pageContext.getOut().print(theTextHasExpressionIterator.getHasExpression());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

