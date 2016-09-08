package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasOtherEdition extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalHasOtherEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasOtherEdition.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasOtherEditionIterator theJournalHasOtherEditionIterator = (JournalHasOtherEditionIterator)findAncestorWithClass(this, JournalHasOtherEditionIterator.class);
			pageContext.getOut().print(theJournalHasOtherEditionIterator.getHasOtherEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

