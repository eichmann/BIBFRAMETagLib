package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialLanguageType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialLanguageType currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialLanguageType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialLanguageIterator theSerialLanguageIterator = (SerialLanguageIterator)findAncestorWithClass(this, SerialLanguageIterator.class);
			pageContext.getOut().print(theSerialLanguageIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for language tag ");
		}
		return SKIP_BODY;
	}
}

