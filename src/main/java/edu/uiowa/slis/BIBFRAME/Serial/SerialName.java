package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialName extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialName currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SerialNameIterator theSerial = (SerialNameIterator)findAncestorWithClass(this, SerialNameIterator.class);
			pageContext.getOut().print(theSerial.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for name tag ");
		}
		return SKIP_BODY;
	}
}

