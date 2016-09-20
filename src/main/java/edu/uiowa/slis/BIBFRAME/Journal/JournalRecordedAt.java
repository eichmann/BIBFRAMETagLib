package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalRecordedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalRecordedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalRecordedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalRecordedAtIterator theJournalRecordedAtIterator = (JournalRecordedAtIterator)findAncestorWithClass(this, JournalRecordedAtIterator.class);
			pageContext.getOut().print(theJournalRecordedAtIterator.getRecordedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

