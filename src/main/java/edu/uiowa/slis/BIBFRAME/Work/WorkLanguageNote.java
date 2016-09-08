package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkLanguageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkLanguageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkLanguageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkLanguageNoteIterator theWork = (WorkLanguageNoteIterator)findAncestorWithClass(this, WorkLanguageNoteIterator.class);
			pageContext.getOut().print(theWork.getLanguageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for languageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for languageNote tag ");
		}
		return SKIP_BODY;
	}
}

