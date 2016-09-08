package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialAbsorbedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialAbsorbedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialAbsorbedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialAbsorbedByIterator theSerialAbsorbedByIterator = (SerialAbsorbedByIterator)findAncestorWithClass(this, SerialAbsorbedByIterator.class);
			pageContext.getOut().print(theSerialAbsorbedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

