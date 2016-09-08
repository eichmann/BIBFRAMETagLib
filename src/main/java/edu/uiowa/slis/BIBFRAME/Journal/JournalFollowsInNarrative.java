package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalFollowsInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalFollowsInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalFollowsInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalFollowsInNarrativeIterator theJournalFollowsInNarrativeIterator = (JournalFollowsInNarrativeIterator)findAncestorWithClass(this, JournalFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theJournalFollowsInNarrativeIterator.getFollowsInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

