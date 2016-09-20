package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialAbsorbedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialAbsorbedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialAbsorbedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialAbsorbedByIterator theSerialAbsorbedByIterator = (SerialAbsorbedByIterator)findAncestorWithClass(this, SerialAbsorbedByIterator.class);
			pageContext.getOut().print(theSerialAbsorbedByIterator.getAbsorbedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

