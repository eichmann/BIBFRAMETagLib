package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalFormDesignationIterator theJournal = (JournalFormDesignationIterator)findAncestorWithClass(this, JournalFormDesignationIterator.class);
			pageContext.getOut().print(theJournal.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

