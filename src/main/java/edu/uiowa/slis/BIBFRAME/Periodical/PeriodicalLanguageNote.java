package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalLanguageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalLanguageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalLanguageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalLanguageNoteIterator thePeriodical = (PeriodicalLanguageNoteIterator)findAncestorWithClass(this, PeriodicalLanguageNoteIterator.class);
			pageContext.getOut().print(thePeriodical.getLanguageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for languageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for languageNote tag ");
		}
		return SKIP_BODY;
	}
}

