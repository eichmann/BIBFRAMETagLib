package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialTranslatedAs extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialTranslatedAs currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialTranslatedAs.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialTranslatedAsIterator theSerialTranslatedAsIterator = (SerialTranslatedAsIterator)findAncestorWithClass(this, SerialTranslatedAsIterator.class);
			pageContext.getOut().print(theSerialTranslatedAsIterator.getTranslatedAs());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

