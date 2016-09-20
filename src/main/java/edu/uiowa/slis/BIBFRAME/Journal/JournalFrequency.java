package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalFrequency extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalFrequency currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalFrequency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalFrequencyIterator theJournal = (JournalFrequencyIterator)findAncestorWithClass(this, JournalFrequencyIterator.class);
			pageContext.getOut().print(theJournal.getFrequency());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for frequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for frequency tag ");
		}
		return SKIP_BODY;
	}
}

