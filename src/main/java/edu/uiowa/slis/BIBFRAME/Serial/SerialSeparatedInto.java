package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialSeparatedInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialSeparatedInto currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialSeparatedInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialSeparatedIntoIterator theSerialSeparatedIntoIterator = (SerialSeparatedIntoIterator)findAncestorWithClass(this, SerialSeparatedIntoIterator.class);
			pageContext.getOut().print(theSerialSeparatedIntoIterator.getSeparatedInto());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

