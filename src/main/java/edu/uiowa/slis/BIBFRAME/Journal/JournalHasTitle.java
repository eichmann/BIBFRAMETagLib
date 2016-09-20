package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasTitleIterator theJournalHasTitleIterator = (JournalHasTitleIterator)findAncestorWithClass(this, JournalHasTitleIterator.class);
			pageContext.getOut().print(theJournalHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

