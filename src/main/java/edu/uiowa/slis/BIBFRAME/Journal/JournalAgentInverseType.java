package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalAgentInverseIterator theJournalAgentInverseIterator = (JournalAgentInverseIterator)findAncestorWithClass(this, JournalAgentInverseIterator.class);
			pageContext.getOut().print(theJournalAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for agent tag ");
		}
		return SKIP_BODY;
	}
}
