package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialHasAbsorbed extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialHasAbsorbed currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialHasAbsorbed.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialHasAbsorbedIterator theSerialHasAbsorbedIterator = (SerialHasAbsorbedIterator)findAncestorWithClass(this, SerialHasAbsorbedIterator.class);
			pageContext.getOut().print(theSerialHasAbsorbedIterator.getHasAbsorbed());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

