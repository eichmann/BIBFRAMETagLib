package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementLanguageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementLanguageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementLanguageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementLanguageNoteIterator theNotatedMovement = (NotatedMovementLanguageNoteIterator)findAncestorWithClass(this, NotatedMovementLanguageNoteIterator.class);
			pageContext.getOut().print(theNotatedMovement.getLanguageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for languageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for languageNote tag ");
		}
		return SKIP_BODY;
	}
}

