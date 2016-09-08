package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalTemporalCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalTemporalCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalTemporalCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalTemporalCoverageNoteIterator theJournal = (JournalTemporalCoverageNoteIterator)findAncestorWithClass(this, JournalTemporalCoverageNoteIterator.class);
			pageContext.getOut().print(theJournal.getTemporalCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for temporalCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for temporalCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

