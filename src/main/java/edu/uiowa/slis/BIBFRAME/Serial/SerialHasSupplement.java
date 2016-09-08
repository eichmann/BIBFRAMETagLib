package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialHasSupplement extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialHasSupplement currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialHasSupplement.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialHasSupplementIterator theSerialHasSupplementIterator = (SerialHasSupplementIterator)findAncestorWithClass(this, SerialHasSupplementIterator.class);
			pageContext.getOut().print(theSerialHasSupplementIterator.getHasSupplement());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

