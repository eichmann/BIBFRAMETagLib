package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialHasSupplementType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialHasSupplementType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialHasSupplementType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialHasSupplementIterator theSerialHasSupplementIterator = (SerialHasSupplementIterator)findAncestorWithClass(this, SerialHasSupplementIterator.class);
			pageContext.getOut().print(theSerialHasSupplementIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

