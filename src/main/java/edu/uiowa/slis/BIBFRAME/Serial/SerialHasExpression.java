package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialHasExpression extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialHasExpression currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialHasExpression.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialHasExpressionIterator theSerialHasExpressionIterator = (SerialHasExpressionIterator)findAncestorWithClass(this, SerialHasExpressionIterator.class);
			pageContext.getOut().print(theSerialHasExpressionIterator.getHasExpression());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

