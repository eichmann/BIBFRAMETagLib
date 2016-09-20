package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialHasExpressionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialHasExpressionType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialHasExpressionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialHasExpressionIterator theSerialHasExpressionIterator = (SerialHasExpressionIterator)findAncestorWithClass(this, SerialHasExpressionIterator.class);
			pageContext.getOut().print(theSerialHasExpressionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

