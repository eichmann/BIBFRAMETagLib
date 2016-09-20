package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasOriginalVersion extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalHasOriginalVersion currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasOriginalVersion.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasOriginalVersionIterator theJournalHasOriginalVersionIterator = (JournalHasOriginalVersionIterator)findAncestorWithClass(this, JournalHasOriginalVersionIterator.class);
			pageContext.getOut().print(theJournalHasOriginalVersionIterator.getHasOriginalVersion());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

