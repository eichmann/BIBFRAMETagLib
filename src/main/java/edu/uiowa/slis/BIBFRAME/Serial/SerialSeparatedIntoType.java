package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialSeparatedIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialSeparatedIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialSeparatedIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialSeparatedIntoIterator theSerialSeparatedIntoIterator = (SerialSeparatedIntoIterator)findAncestorWithClass(this, SerialSeparatedIntoIterator.class);
			pageContext.getOut().print(theSerialSeparatedIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

