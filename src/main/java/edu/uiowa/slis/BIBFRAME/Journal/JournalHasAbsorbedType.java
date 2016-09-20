package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasAbsorbedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalHasAbsorbedType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasAbsorbedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasAbsorbedIterator theJournalHasAbsorbedIterator = (JournalHasAbsorbedIterator)findAncestorWithClass(this, JournalHasAbsorbedIterator.class);
			pageContext.getOut().print(theJournalHasAbsorbedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

