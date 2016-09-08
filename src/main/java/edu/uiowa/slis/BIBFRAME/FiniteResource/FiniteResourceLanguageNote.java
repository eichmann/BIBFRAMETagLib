package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceLanguageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceLanguageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceLanguageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceLanguageNoteIterator theFiniteResource = (FiniteResourceLanguageNoteIterator)findAncestorWithClass(this, FiniteResourceLanguageNoteIterator.class);
			pageContext.getOut().print(theFiniteResource.getLanguageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for languageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for languageNote tag ");
		}
		return SKIP_BODY;
	}
}

