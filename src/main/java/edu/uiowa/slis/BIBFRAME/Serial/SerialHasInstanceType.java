package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialHasInstanceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialHasInstanceType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialHasInstanceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialHasInstanceIterator theSerialHasInstanceIterator = (SerialHasInstanceIterator)findAncestorWithClass(this, SerialHasInstanceIterator.class);
			pageContext.getOut().print(theSerialHasInstanceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

