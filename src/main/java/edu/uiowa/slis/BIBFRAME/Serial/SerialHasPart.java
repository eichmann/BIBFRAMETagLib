package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialHasPartIterator theSerialHasPartIterator = (SerialHasPartIterator)findAncestorWithClass(this, SerialHasPartIterator.class);
			pageContext.getOut().print(theSerialHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

