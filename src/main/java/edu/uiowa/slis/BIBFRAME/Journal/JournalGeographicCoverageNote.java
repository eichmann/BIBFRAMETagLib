package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalGeographicCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalGeographicCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalGeographicCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalGeographicCoverageNoteIterator theJournal = (JournalGeographicCoverageNoteIterator)findAncestorWithClass(this, JournalGeographicCoverageNoteIterator.class);
			pageContext.getOut().print(theJournal.getGeographicCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for geographicCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for geographicCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

