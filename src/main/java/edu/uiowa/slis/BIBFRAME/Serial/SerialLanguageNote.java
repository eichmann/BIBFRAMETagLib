package edu.uiowa.slis.BIBFRAME.Serial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SerialLanguageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SerialLanguageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(SerialLanguageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SerialLanguageNoteIterator theSerial = (SerialLanguageNoteIterator)findAncestorWithClass(this, SerialLanguageNoteIterator.class);
			pageContext.getOut().print(theSerial.getLanguageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Serial for languageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Serial for languageNote tag ");
		}
		return SKIP_BODY;
	}
}

