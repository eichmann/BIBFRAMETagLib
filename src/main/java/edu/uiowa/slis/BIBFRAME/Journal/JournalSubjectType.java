package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalSubjectType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalSubjectType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalSubjectType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalSubjectIterator theJournalSubjectIterator = (JournalSubjectIterator)findAncestorWithClass(this, JournalSubjectIterator.class);
			pageContext.getOut().print(theJournalSubjectIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for subject tag ");
		}
		return SKIP_BODY;
	}
}

