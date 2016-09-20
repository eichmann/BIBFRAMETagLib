package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineLanguageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineLanguageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineLanguageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MagazineLanguageNoteIterator theMagazine = (MagazineLanguageNoteIterator)findAncestorWithClass(this, MagazineLanguageNoteIterator.class);
			pageContext.getOut().print(theMagazine.getLanguageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for languageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for languageNote tag ");
		}
		return SKIP_BODY;
	}
}

