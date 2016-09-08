package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasFindingAid extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalHasFindingAid currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasFindingAid.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasFindingAidIterator theJournalHasFindingAidIterator = (JournalHasFindingAidIterator)findAncestorWithClass(this, JournalHasFindingAidIterator.class);
			pageContext.getOut().print(theJournalHasFindingAidIterator.getHasFindingAid());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}

