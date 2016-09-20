package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalIsSubjectOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalIsSubjectOf currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalIsSubjectOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalIsSubjectOfIterator theJournalIsSubjectOfIterator = (JournalIsSubjectOfIterator)findAncestorWithClass(this, JournalIsSubjectOfIterator.class);
			pageContext.getOut().print(theJournalIsSubjectOfIterator.getIsSubjectOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

