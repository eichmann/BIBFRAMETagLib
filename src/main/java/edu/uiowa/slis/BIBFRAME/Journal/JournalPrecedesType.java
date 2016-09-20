package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalPrecedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalPrecedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalPrecedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalPrecedesIterator theJournalPrecedesIterator = (JournalPrecedesIterator)findAncestorWithClass(this, JournalPrecedesIterator.class);
			pageContext.getOut().print(theJournalPrecedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for precedes tag ");
		}
		return SKIP_BODY;
	}
}

