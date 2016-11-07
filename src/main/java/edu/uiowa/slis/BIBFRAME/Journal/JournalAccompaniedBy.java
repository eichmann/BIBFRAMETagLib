package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalAccompaniedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalAccompaniedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalAccompaniedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalAccompaniedByIterator theJournalAccompaniedByIterator = (JournalAccompaniedByIterator)findAncestorWithClass(this, JournalAccompaniedByIterator.class);
			pageContext.getOut().print(theJournalAccompaniedByIterator.getAccompaniedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}
