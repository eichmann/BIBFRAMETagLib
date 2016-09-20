package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalIsLastOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalIsLastOf currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalIsLastOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalIsLastOfIterator theJournalIsLastOfIterator = (JournalIsLastOfIterator)findAncestorWithClass(this, JournalIsLastOfIterator.class);
			pageContext.getOut().print(theJournalIsLastOfIterator.getIsLastOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

