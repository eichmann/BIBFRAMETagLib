package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialTranslatesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialTranslatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialTranslatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialTranslatesIterator theSerialTranslatesIterator = (SerialTranslatesIterator)findAncestorWithClass(this, SerialTranslatesIterator.class);
			pageContext.getOut().print(theSerialTranslatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for translates tag ");
		}
		return SKIP_BODY;
	}
}

