package edu.uiowa.slis.BIBFRAME.Class;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ClassNote currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClassNoteIterator theClass = (ClassNoteIterator)findAncestorWithClass(this, ClassNoteIterator.class);
			pageContext.getOut().print(theClass.getNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Class for note tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for note tag ");
		}
		return SKIP_BODY;
	}
}

