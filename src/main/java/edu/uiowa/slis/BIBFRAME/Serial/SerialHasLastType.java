package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialHasLastType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialHasLastType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialHasLastType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialHasLastIterator theSerialHasLastIterator = (SerialHasLastIterator)findAncestorWithClass(this, SerialHasLastIterator.class);
			pageContext.getOut().print(theSerialHasLastIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for hasLast tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for hasLast tag ");
		}
		return SKIP_BODY;
	}
}

