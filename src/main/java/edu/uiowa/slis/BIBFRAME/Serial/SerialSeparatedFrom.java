package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialSeparatedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialSeparatedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialSeparatedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialSeparatedFromIterator theSerialSeparatedFromIterator = (SerialSeparatedFromIterator)findAncestorWithClass(this, SerialSeparatedFromIterator.class);
			pageContext.getOut().print(theSerialSeparatedFromIterator.getSeparatedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

