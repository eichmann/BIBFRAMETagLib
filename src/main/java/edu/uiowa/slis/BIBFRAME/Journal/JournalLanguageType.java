package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalLanguageType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalLanguageType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalLanguageType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalLanguageIterator theJournalLanguageIterator = (JournalLanguageIterator)findAncestorWithClass(this, JournalLanguageIterator.class);
			pageContext.getOut().print(theJournalLanguageIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for language tag ");
		}
		return SKIP_BODY;
	}
}

