package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalIdentifiedByIterator theJournalIdentifiedByIterator = (JournalIdentifiedByIterator)findAncestorWithClass(this, JournalIdentifiedByIterator.class);
			pageContext.getOut().print(theJournalIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

