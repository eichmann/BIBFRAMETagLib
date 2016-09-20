package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalSplitInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalSplitInto currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalSplitInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalSplitIntoIterator theJournalSplitIntoIterator = (JournalSplitIntoIterator)findAncestorWithClass(this, JournalSplitIntoIterator.class);
			pageContext.getOut().print(theJournalSplitIntoIterator.getSplitInto());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

