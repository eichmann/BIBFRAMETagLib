package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalSupersedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalSupersedes currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalSupersedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalSupersedesIterator theJournalSupersedesIterator = (JournalSupersedesIterator)findAncestorWithClass(this, JournalSupersedesIterator.class);
			pageContext.getOut().print(theJournalSupersedesIterator.getSupersedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

