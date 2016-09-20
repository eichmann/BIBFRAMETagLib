package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalContinuedUnderNewTitleByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalContinuedUnderNewTitleByType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalContinuedUnderNewTitleByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalContinuedUnderNewTitleByIterator theJournalContinuedUnderNewTitleByIterator = (JournalContinuedUnderNewTitleByIterator)findAncestorWithClass(this, JournalContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theJournalContinuedUnderNewTitleByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

