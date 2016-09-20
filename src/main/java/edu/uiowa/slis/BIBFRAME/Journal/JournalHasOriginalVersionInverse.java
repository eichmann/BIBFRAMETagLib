package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasOriginalVersionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalHasOriginalVersionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasOriginalVersionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasOriginalVersionInverseIterator theJournalHasOriginalVersionInverseIterator = (JournalHasOriginalVersionInverseIterator)findAncestorWithClass(this, JournalHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theJournalHasOriginalVersionInverseIterator.getHasOriginalVersionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

