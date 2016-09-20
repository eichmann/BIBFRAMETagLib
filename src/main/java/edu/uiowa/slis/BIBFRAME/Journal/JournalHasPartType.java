package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasPartIterator theJournalHasPartIterator = (JournalHasPartIterator)findAncestorWithClass(this, JournalHasPartIterator.class);
			pageContext.getOut().print(theJournalHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

