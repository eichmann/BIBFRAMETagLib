package edu.uiowa.slis.BIBFRAME.ObjectProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ObjectPropertyNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ObjectPropertyNote currentInstance = null;
	private static final Log log = LogFactory.getLog(ObjectPropertyNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ObjectPropertyNoteIterator theObjectProperty = (ObjectPropertyNoteIterator)findAncestorWithClass(this, ObjectPropertyNoteIterator.class);
			pageContext.getOut().print(theObjectProperty.getNote());
		} catch (Exception e) {
			log.error("Can't find enclosing ObjectProperty for note tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for note tag ");
		}
		return SKIP_BODY;
	}
}

