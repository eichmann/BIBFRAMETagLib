package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalIsFirstOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalIsFirstOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalIsFirstOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalIsFirstOfIterator theJournalIsFirstOfIterator = (JournalIsFirstOfIterator)findAncestorWithClass(this, JournalIsFirstOfIterator.class);
			pageContext.getOut().print(theJournalIsFirstOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

