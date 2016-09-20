package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalFollowsInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalFollowsInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalFollowsInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalFollowsInNarrativeInverseIterator theJournalFollowsInNarrativeInverseIterator = (JournalFollowsInNarrativeInverseIterator)findAncestorWithClass(this, JournalFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theJournalFollowsInNarrativeInverseIterator.getFollowsInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

