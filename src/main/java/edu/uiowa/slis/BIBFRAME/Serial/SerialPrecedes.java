package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialPrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialPrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialPrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialPrecedesIterator theSerialPrecedesIterator = (SerialPrecedesIterator)findAncestorWithClass(this, SerialPrecedesIterator.class);
			pageContext.getOut().print(theSerialPrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for precedes tag ");
		}
		return SKIP_BODY;
	}
}

