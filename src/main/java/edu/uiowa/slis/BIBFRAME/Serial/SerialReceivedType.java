package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialReceivedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialReceivedType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialReceivedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialReceivedIterator theSerialReceivedIterator = (SerialReceivedIterator)findAncestorWithClass(this, SerialReceivedIterator.class);
			pageContext.getOut().print(theSerialReceivedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for received tag ");
		}
		return SKIP_BODY;
	}
}

