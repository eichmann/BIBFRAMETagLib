package edu.uiowa.slis.BIBFRAME.Class;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassEditorialNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ClassEditorialNote currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassEditorialNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClassEditorialNoteIterator theClass = (ClassEditorialNoteIterator)findAncestorWithClass(this, ClassEditorialNoteIterator.class);
			pageContext.getOut().print(theClass.getEditorialNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Class for editorialNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for editorialNote tag ");
		}
		return SKIP_BODY;
	}
}

