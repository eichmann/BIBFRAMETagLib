package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialHasOriginalVersion extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialHasOriginalVersion currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialHasOriginalVersion.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialHasOriginalVersionIterator theSerialHasOriginalVersionIterator = (SerialHasOriginalVersionIterator)findAncestorWithClass(this, SerialHasOriginalVersionIterator.class);
			pageContext.getOut().print(theSerialHasOriginalVersionIterator.getHasOriginalVersion());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

