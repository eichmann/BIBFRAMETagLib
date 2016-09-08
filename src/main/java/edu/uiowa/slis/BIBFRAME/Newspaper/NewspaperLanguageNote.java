package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperLanguageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperLanguageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperLanguageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewspaperLanguageNoteIterator theNewspaper = (NewspaperLanguageNoteIterator)findAncestorWithClass(this, NewspaperLanguageNoteIterator.class);
			pageContext.getOut().print(theNewspaper.getLanguageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for languageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for languageNote tag ");
		}
		return SKIP_BODY;
	}
}

