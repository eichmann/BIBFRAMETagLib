package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartLanguageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartLanguageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartLanguageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPartLanguageNoteIterator thePeriodicalPart = (PeriodicalPartLanguageNoteIterator)findAncestorWithClass(this, PeriodicalPartLanguageNoteIterator.class);
			pageContext.getOut().print(thePeriodicalPart.getLanguageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for languageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for languageNote tag ");
		}
		return SKIP_BODY;
	}
}

