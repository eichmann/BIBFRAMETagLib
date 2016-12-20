package edu.uiowa.slis.BIBFRAME.SymmetricProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SymmetricPropertyEditorialNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SymmetricPropertyEditorialNote currentInstance = null;
	private static final Log log = LogFactory.getLog(SymmetricPropertyEditorialNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SymmetricPropertyEditorialNoteIterator theSymmetricProperty = (SymmetricPropertyEditorialNoteIterator)findAncestorWithClass(this, SymmetricPropertyEditorialNoteIterator.class);
			pageContext.getOut().print(theSymmetricProperty.getEditorialNote());
		} catch (Exception e) {
			log.error("Can't find enclosing SymmetricProperty for editorialNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing SymmetricProperty for editorialNote tag ");
		}
		return SKIP_BODY;
	}
}

