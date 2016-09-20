package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalDerivedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalDerivedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalDerivedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalDerivedFromIterator theJournalDerivedFromIterator = (JournalDerivedFromIterator)findAncestorWithClass(this, JournalDerivedFromIterator.class);
			pageContext.getOut().print(theJournalDerivedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

