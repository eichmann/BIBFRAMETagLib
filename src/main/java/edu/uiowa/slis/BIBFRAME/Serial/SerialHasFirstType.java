package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialHasFirstType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialHasFirstType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialHasFirstType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialHasFirstIterator theSerialHasFirstIterator = (SerialHasFirstIterator)findAncestorWithClass(this, SerialHasFirstIterator.class);
			pageContext.getOut().print(theSerialHasFirstIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for hasFirst tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for hasFirst tag ");
		}
		return SKIP_BODY;
	}
}

