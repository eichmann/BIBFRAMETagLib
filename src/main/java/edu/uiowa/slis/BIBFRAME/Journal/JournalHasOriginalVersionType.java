package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasOriginalVersionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalHasOriginalVersionType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasOriginalVersionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasOriginalVersionIterator theJournalHasOriginalVersionIterator = (JournalHasOriginalVersionIterator)findAncestorWithClass(this, JournalHasOriginalVersionIterator.class);
			pageContext.getOut().print(theJournalHasOriginalVersionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

