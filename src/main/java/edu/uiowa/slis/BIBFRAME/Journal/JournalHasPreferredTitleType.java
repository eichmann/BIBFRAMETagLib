package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasPreferredTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalHasPreferredTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasPreferredTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasPreferredTitleIterator theJournalHasPreferredTitleIterator = (JournalHasPreferredTitleIterator)findAncestorWithClass(this, JournalHasPreferredTitleIterator.class);
			pageContext.getOut().print(theJournalHasPreferredTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

