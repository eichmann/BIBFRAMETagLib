package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalIsPartOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalIsPartOf currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalIsPartOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalIsPartOfIterator theJournalIsPartOfIterator = (JournalIsPartOfIterator)findAncestorWithClass(this, JournalIsPartOfIterator.class);
			pageContext.getOut().print(theJournalIsPartOfIterator.getIsPartOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

