package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalIsFindingAidForType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalIsFindingAidForType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalIsFindingAidForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalIsFindingAidForIterator theJournalIsFindingAidForIterator = (JournalIsFindingAidForIterator)findAncestorWithClass(this, JournalIsFindingAidForIterator.class);
			pageContext.getOut().print(theJournalIsFindingAidForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

