package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalSupersededByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalSupersededByType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalSupersededByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalSupersededByIterator theJournalSupersededByIterator = (JournalSupersededByIterator)findAncestorWithClass(this, JournalSupersededByIterator.class);
			pageContext.getOut().print(theJournalSupersededByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

