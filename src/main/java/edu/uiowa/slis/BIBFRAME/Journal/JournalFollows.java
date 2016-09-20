package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalFollows extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalFollows currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalFollows.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalFollowsIterator theJournalFollowsIterator = (JournalFollowsIterator)findAncestorWithClass(this, JournalFollowsIterator.class);
			pageContext.getOut().print(theJournalFollowsIterator.getFollows());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for follows tag ");
		}
		return SKIP_BODY;
	}
}

