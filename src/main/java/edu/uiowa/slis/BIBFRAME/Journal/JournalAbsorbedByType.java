package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalAbsorbedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalAbsorbedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalAbsorbedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalAbsorbedByIterator theJournalAbsorbedByIterator = (JournalAbsorbedByIterator)findAncestorWithClass(this, JournalAbsorbedByIterator.class);
			pageContext.getOut().print(theJournalAbsorbedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

