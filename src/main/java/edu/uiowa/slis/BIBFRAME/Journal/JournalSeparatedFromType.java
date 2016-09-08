package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalSeparatedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalSeparatedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalSeparatedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalSeparatedFromIterator theJournalSeparatedFromIterator = (JournalSeparatedFromIterator)findAncestorWithClass(this, JournalSeparatedFromIterator.class);
			pageContext.getOut().print(theJournalSeparatedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

