package edu.uiowa.slis.BIBFRAME.Cartography;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CartographyLanguageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CartographyLanguageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(CartographyLanguageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CartographyLanguageNoteIterator theCartography = (CartographyLanguageNoteIterator)findAncestorWithClass(this, CartographyLanguageNoteIterator.class);
			pageContext.getOut().print(theCartography.getLanguageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Cartography for languageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Cartography for languageNote tag ");
		}
		return SKIP_BODY;
	}
}

