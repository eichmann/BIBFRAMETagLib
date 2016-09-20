package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalLanguageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalLanguageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalLanguageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalLanguageNoteIterator theJournal = (JournalLanguageNoteIterator)findAncestorWithClass(this, JournalLanguageNoteIterator.class);
			pageContext.getOut().print(theJournal.getLanguageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for languageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for languageNote tag ");
		}
		return SKIP_BODY;
	}
}

