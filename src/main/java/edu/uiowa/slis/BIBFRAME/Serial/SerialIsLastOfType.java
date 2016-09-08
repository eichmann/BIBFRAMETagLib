package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialIsLastOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialIsLastOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialIsLastOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialIsLastOfIterator theSerialIsLastOfIterator = (SerialIsLastOfIterator)findAncestorWithClass(this, SerialIsLastOfIterator.class);
			pageContext.getOut().print(theSerialIsLastOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

