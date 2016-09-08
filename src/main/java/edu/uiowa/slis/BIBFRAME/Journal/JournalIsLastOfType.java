package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalIsLastOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalIsLastOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalIsLastOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalIsLastOfIterator theJournalIsLastOfIterator = (JournalIsLastOfIterator)findAncestorWithClass(this, JournalIsLastOfIterator.class);
			pageContext.getOut().print(theJournalIsLastOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

