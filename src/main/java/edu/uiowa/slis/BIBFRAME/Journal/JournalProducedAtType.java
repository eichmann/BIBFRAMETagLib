package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalProducedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalProducedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalProducedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalProducedAtIterator theJournalProducedAtIterator = (JournalProducedAtIterator)findAncestorWithClass(this, JournalProducedAtIterator.class);
			pageContext.getOut().print(theJournalProducedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for producedAt tag ");
		}
		return SKIP_BODY;
	}
}

