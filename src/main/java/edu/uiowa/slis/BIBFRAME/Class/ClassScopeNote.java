package edu.uiowa.slis.BIBFRAME.Class;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassScopeNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ClassScopeNote currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassScopeNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClassScopeNoteIterator theClass = (ClassScopeNoteIterator)findAncestorWithClass(this, ClassScopeNoteIterator.class);
			pageContext.getOut().print(theClass.getScopeNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Class for scopeNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for scopeNote tag ");
		}
		return SKIP_BODY;
	}
}

