package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalAgentInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalAgentInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalAgentInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalAgentInverseIterator theJournalAgentInverseIterator = (JournalAgentInverseIterator)findAncestorWithClass(this, JournalAgentInverseIterator.class);
			pageContext.getOut().print(theJournalAgentInverseIterator.getAgentInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for agent tag ");
		}
		return SKIP_BODY;
	}
}

