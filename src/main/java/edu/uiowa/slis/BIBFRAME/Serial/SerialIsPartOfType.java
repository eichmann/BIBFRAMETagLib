package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialIsPartOfIterator theSerialIsPartOfIterator = (SerialIsPartOfIterator)findAncestorWithClass(this, SerialIsPartOfIterator.class);
			pageContext.getOut().print(theSerialIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

