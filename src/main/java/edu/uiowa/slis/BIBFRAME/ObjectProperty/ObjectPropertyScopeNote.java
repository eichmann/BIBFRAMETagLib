package edu.uiowa.slis.BIBFRAME.ObjectProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ObjectPropertyScopeNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ObjectPropertyScopeNote currentInstance = null;
	private static final Log log = LogFactory.getLog(ObjectPropertyScopeNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ObjectPropertyScopeNoteIterator theObjectProperty = (ObjectPropertyScopeNoteIterator)findAncestorWithClass(this, ObjectPropertyScopeNoteIterator.class);
			pageContext.getOut().print(theObjectProperty.getScopeNote());
		} catch (Exception e) {
			log.error("Can't find enclosing ObjectProperty for scopeNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for scopeNote tag ");
		}
		return SKIP_BODY;
	}
}

