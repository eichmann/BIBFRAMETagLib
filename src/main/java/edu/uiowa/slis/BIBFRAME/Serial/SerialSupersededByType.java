package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialSupersededByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialSupersededByType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialSupersededByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialSupersededByIterator theSerialSupersededByIterator = (SerialSupersededByIterator)findAncestorWithClass(this, SerialSupersededByIterator.class);
			pageContext.getOut().print(theSerialSupersededByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

