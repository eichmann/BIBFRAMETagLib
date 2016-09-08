package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialLanguage extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialLanguage currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialLanguage.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SerialLanguageIterator theSerialLanguageIterator = (SerialLanguageIterator)findAncestorWithClass(this, SerialLanguageIterator.class);
			pageContext.getOut().print(theSerialLanguageIterator.getLanguage());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for language tag ");
		}
		return SKIP_BODY;
	}
}

