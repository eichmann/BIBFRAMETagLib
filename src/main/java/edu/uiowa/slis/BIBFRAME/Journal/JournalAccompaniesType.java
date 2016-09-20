package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalAccompaniesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalAccompaniesType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalAccompaniesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalAccompaniesIterator theJournalAccompaniesIterator = (JournalAccompaniesIterator)findAncestorWithClass(this, JournalAccompaniesIterator.class);
			pageContext.getOut().print(theJournalAccompaniesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

