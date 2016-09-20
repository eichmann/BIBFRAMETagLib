package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialIsExpressionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialIsExpressionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialIsExpressionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialIsExpressionOfIterator theSerialIsExpressionOfIterator = (SerialIsExpressionOfIterator)findAncestorWithClass(this, SerialIsExpressionOfIterator.class);
			pageContext.getOut().print(theSerialIsExpressionOfIterator.getIsExpressionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

