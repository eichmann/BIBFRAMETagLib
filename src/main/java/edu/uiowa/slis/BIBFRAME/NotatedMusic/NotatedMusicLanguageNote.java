package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicLanguageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicLanguageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicLanguageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicLanguageNoteIterator theNotatedMusic = (NotatedMusicLanguageNoteIterator)findAncestorWithClass(this, NotatedMusicLanguageNoteIterator.class);
			pageContext.getOut().print(theNotatedMusic.getLanguageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for languageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for languageNote tag ");
		}
		return SKIP_BODY;
	}
}

