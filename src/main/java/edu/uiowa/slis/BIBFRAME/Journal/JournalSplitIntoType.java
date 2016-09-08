package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalSplitIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalSplitIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalSplitIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalSplitIntoIterator theJournalSplitIntoIterator = (JournalSplitIntoIterator)findAncestorWithClass(this, JournalSplitIntoIterator.class);
			pageContext.getOut().print(theJournalSplitIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

