package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalSupplements extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalSupplements currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalSupplements.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalSupplementsIterator theJournalSupplementsIterator = (JournalSupplementsIterator)findAncestorWithClass(this, JournalSupplementsIterator.class);
			pageContext.getOut().print(theJournalSupplementsIterator.getSupplements());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for supplements tag ");
		}
		return SKIP_BODY;
	}
}

