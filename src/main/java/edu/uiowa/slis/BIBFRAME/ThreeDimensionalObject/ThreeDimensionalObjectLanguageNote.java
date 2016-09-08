package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectLanguageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectLanguageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectLanguageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectLanguageNoteIterator theThreeDimensionalObject = (ThreeDimensionalObjectLanguageNoteIterator)findAncestorWithClass(this, ThreeDimensionalObjectLanguageNoteIterator.class);
			pageContext.getOut().print(theThreeDimensionalObject.getLanguageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for languageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for languageNote tag ");
		}
		return SKIP_BODY;
	}
}

