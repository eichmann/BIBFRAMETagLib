package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasInstanceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalHasInstanceType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasInstanceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasInstanceIterator theJournalHasInstanceIterator = (JournalHasInstanceIterator)findAncestorWithClass(this, JournalHasInstanceIterator.class);
			pageContext.getOut().print(theJournalHasInstanceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

