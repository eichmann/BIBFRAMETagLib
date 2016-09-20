package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialHasTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialHasTitleIterator theSerialHasTitleIterator = (SerialHasTitleIterator)findAncestorWithClass(this, SerialHasTitleIterator.class);
			pageContext.getOut().print(theSerialHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

