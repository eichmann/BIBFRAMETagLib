package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalReceivedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalReceivedType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalReceivedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalReceivedIterator theJournalReceivedIterator = (JournalReceivedIterator)findAncestorWithClass(this, JournalReceivedIterator.class);
			pageContext.getOut().print(theJournalReceivedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for received tag ");
		}
		return SKIP_BODY;
	}
}

