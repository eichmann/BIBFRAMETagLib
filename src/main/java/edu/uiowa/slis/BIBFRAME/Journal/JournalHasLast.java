package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasLast extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalHasLast currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasLast.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasLastIterator theJournalHasLastIterator = (JournalHasLastIterator)findAncestorWithClass(this, JournalHasLastIterator.class);
			pageContext.getOut().print(theJournalHasLastIterator.getHasLast());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasLast tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasLast tag ");
		}
		return SKIP_BODY;
	}
}

