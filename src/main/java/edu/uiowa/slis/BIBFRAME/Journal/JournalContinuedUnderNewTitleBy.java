package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalContinuedUnderNewTitleBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalContinuedUnderNewTitleBy currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalContinuedUnderNewTitleBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalContinuedUnderNewTitleByIterator theJournalContinuedUnderNewTitleByIterator = (JournalContinuedUnderNewTitleByIterator)findAncestorWithClass(this, JournalContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theJournalContinuedUnderNewTitleByIterator.getContinuedUnderNewTitleBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

