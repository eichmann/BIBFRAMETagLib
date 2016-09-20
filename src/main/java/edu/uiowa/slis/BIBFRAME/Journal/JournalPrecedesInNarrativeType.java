package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalPrecedesInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalPrecedesInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalPrecedesInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalPrecedesInNarrativeIterator theJournalPrecedesInNarrativeIterator = (JournalPrecedesInNarrativeIterator)findAncestorWithClass(this, JournalPrecedesInNarrativeIterator.class);
			pageContext.getOut().print(theJournalPrecedesInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

