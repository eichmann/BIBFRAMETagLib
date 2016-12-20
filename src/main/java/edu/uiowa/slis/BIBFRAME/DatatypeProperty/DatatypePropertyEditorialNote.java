package edu.uiowa.slis.BIBFRAME.DatatypeProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatatypePropertyEditorialNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatatypePropertyEditorialNote currentInstance = null;
	private static final Log log = LogFactory.getLog(DatatypePropertyEditorialNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatatypePropertyEditorialNoteIterator theDatatypeProperty = (DatatypePropertyEditorialNoteIterator)findAncestorWithClass(this, DatatypePropertyEditorialNoteIterator.class);
			pageContext.getOut().print(theDatatypeProperty.getEditorialNote());
		} catch (Exception e) {
			log.error("Can't find enclosing DatatypeProperty for editorialNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing DatatypeProperty for editorialNote tag ");
		}
		return SKIP_BODY;
	}
}

