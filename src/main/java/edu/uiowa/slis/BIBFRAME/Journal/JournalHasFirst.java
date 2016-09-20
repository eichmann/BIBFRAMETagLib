package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasFirst extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalHasFirst currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasFirst.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasFirstIterator theJournalHasFirstIterator = (JournalHasFirstIterator)findAncestorWithClass(this, JournalHasFirstIterator.class);
			pageContext.getOut().print(theJournalHasFirstIterator.getHasFirst());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasFirst tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasFirst tag ");
		}
		return SKIP_BODY;
	}
}

