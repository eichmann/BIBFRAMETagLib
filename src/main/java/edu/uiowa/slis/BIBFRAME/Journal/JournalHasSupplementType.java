package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasSupplementType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalHasSupplementType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasSupplementType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasSupplementIterator theJournalHasSupplementIterator = (JournalHasSupplementIterator)findAncestorWithClass(this, JournalHasSupplementIterator.class);
			pageContext.getOut().print(theJournalHasSupplementIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

