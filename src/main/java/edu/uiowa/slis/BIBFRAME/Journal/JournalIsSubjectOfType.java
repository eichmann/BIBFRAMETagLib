package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalIsSubjectOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalIsSubjectOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalIsSubjectOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalIsSubjectOfIterator theJournalIsSubjectOfIterator = (JournalIsSubjectOfIterator)findAncestorWithClass(this, JournalIsSubjectOfIterator.class);
			pageContext.getOut().print(theJournalIsSubjectOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

