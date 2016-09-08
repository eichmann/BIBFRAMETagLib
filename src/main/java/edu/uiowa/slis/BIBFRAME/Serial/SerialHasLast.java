package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialHasLast extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialHasLast currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialHasLast.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialHasLastIterator theSerialHasLastIterator = (SerialHasLastIterator)findAncestorWithClass(this, SerialHasLastIterator.class);
			pageContext.getOut().print(theSerialHasLastIterator.getHasLast());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for hasLast tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for hasLast tag ");
		}
		return SKIP_BODY;
	}
}

