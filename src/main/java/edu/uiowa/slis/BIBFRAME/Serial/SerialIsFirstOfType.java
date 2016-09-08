package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialIsFirstOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialIsFirstOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialIsFirstOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialIsFirstOfIterator theSerialIsFirstOfIterator = (SerialIsFirstOfIterator)findAncestorWithClass(this, SerialIsFirstOfIterator.class);
			pageContext.getOut().print(theSerialIsFirstOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

