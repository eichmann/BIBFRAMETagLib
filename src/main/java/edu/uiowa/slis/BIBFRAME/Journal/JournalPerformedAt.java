package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalPerformedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalPerformedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalPerformedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalPerformedAtIterator theJournalPerformedAtIterator = (JournalPerformedAtIterator)findAncestorWithClass(this, JournalPerformedAtIterator.class);
			pageContext.getOut().print(theJournalPerformedAtIterator.getPerformedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for performedAt tag ");
		}
		return SKIP_BODY;
	}
}
