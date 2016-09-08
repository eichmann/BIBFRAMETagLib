package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographLanguageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographLanguageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographLanguageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MonographLanguageNoteIterator theMonograph = (MonographLanguageNoteIterator)findAncestorWithClass(this, MonographLanguageNoteIterator.class);
			pageContext.getOut().print(theMonograph.getLanguageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for languageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for languageNote tag ");
		}
		return SKIP_BODY;
	}
}

