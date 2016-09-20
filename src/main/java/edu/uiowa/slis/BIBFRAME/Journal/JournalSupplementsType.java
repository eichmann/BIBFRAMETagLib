package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalSupplementsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalSupplementsType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalSupplementsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalSupplementsIterator theJournalSupplementsIterator = (JournalSupplementsIterator)findAncestorWithClass(this, JournalSupplementsIterator.class);
			pageContext.getOut().print(theJournalSupplementsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for supplements tag ");
		}
		return SKIP_BODY;
	}
}

