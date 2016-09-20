package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialHasDerivative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialHasDerivative currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialHasDerivative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialHasDerivativeIterator theSerialHasDerivativeIterator = (SerialHasDerivativeIterator)findAncestorWithClass(this, SerialHasDerivativeIterator.class);
			pageContext.getOut().print(theSerialHasDerivativeIterator.getHasDerivative());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

