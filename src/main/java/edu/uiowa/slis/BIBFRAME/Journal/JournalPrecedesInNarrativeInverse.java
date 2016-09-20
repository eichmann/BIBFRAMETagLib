package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalPrecedesInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalPrecedesInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalPrecedesInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalPrecedesInNarrativeInverseIterator theJournalPrecedesInNarrativeInverseIterator = (JournalPrecedesInNarrativeInverseIterator)findAncestorWithClass(this, JournalPrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theJournalPrecedesInNarrativeInverseIterator.getPrecedesInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

