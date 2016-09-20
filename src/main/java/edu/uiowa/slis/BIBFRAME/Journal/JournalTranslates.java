package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalTranslates extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalTranslates currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalTranslates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalTranslatesIterator theJournalTranslatesIterator = (JournalTranslatesIterator)findAncestorWithClass(this, JournalTranslatesIterator.class);
			pageContext.getOut().print(theJournalTranslatesIterator.getTranslates());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for translates tag ");
		}
		return SKIP_BODY;
	}
}

