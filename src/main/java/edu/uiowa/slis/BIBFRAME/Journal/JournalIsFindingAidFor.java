package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalIsFindingAidFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalIsFindingAidFor currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalIsFindingAidFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalIsFindingAidForIterator theJournalIsFindingAidForIterator = (JournalIsFindingAidForIterator)findAncestorWithClass(this, JournalIsFindingAidForIterator.class);
			pageContext.getOut().print(theJournalIsFindingAidForIterator.getIsFindingAidFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

