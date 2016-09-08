package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalContinuesUnderNewTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalContinuesUnderNewTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalContinuesUnderNewTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalContinuesUnderNewTitleIterator theJournalContinuesUnderNewTitleIterator = (JournalContinuesUnderNewTitleIterator)findAncestorWithClass(this, JournalContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theJournalContinuesUnderNewTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

