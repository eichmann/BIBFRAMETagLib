package edu.uiowa.slis.BIBFRAME.ObjectProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ObjectPropertyEditorialNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ObjectPropertyEditorialNote currentInstance = null;
	private static final Log log = LogFactory.getLog(ObjectPropertyEditorialNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ObjectPropertyEditorialNoteIterator theObjectProperty = (ObjectPropertyEditorialNoteIterator)findAncestorWithClass(this, ObjectPropertyEditorialNoteIterator.class);
			pageContext.getOut().print(theObjectProperty.getEditorialNote());
		} catch (Exception e) {
			log.error("Can't find enclosing ObjectProperty for editorialNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for editorialNote tag ");
		}
		return SKIP_BODY;
	}
}

