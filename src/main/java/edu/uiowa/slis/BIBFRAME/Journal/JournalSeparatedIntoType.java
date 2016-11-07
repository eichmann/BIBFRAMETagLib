package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalSeparatedIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalSeparatedIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalSeparatedIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalSeparatedIntoIterator theJournalSeparatedIntoIterator = (JournalSeparatedIntoIterator)findAncestorWithClass(this, JournalSeparatedIntoIterator.class);
			pageContext.getOut().print(theJournalSeparatedIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}
