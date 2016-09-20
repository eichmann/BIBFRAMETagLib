package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialHasOriginalVersionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialHasOriginalVersionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialHasOriginalVersionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialHasOriginalVersionInverseIterator theSerialHasOriginalVersionInverseIterator = (SerialHasOriginalVersionInverseIterator)findAncestorWithClass(this, SerialHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theSerialHasOriginalVersionInverseIterator.getHasOriginalVersionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

