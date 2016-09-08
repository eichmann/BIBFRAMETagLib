package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextLanguageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextLanguageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(TextLanguageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TextLanguageNoteIterator theText = (TextLanguageNoteIterator)findAncestorWithClass(this, TextLanguageNoteIterator.class);
			pageContext.getOut().print(theText.getLanguageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for languageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for languageNote tag ");
		}
		return SKIP_BODY;
	}
}

