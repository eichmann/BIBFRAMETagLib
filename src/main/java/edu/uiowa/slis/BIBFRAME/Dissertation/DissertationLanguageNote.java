package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationLanguageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationLanguageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationLanguageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DissertationLanguageNoteIterator theDissertation = (DissertationLanguageNoteIterator)findAncestorWithClass(this, DissertationLanguageNoteIterator.class);
			pageContext.getOut().print(theDissertation.getLanguageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for languageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for languageNote tag ");
		}
		return SKIP_BODY;
	}
}

