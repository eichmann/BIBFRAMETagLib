package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialPrecedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialPrecedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialPrecedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialPrecedesIterator theSerialPrecedesIterator = (SerialPrecedesIterator)findAncestorWithClass(this, SerialPrecedesIterator.class);
			pageContext.getOut().print(theSerialPrecedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for precedes tag ");
		}
		return SKIP_BODY;
	}
}

