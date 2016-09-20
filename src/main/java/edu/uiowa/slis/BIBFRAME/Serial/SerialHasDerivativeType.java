package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialHasDerivativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialHasDerivativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialHasDerivativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialHasDerivativeIterator theSerialHasDerivativeIterator = (SerialHasDerivativeIterator)findAncestorWithClass(this, SerialHasDerivativeIterator.class);
			pageContext.getOut().print(theSerialHasDerivativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

