package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasOriginPlace extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalHasOriginPlace currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasOriginPlace.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasOriginPlaceIterator theJournalHasOriginPlaceIterator = (JournalHasOriginPlaceIterator)findAncestorWithClass(this, JournalHasOriginPlaceIterator.class);
			pageContext.getOut().print(theJournalHasOriginPlaceIterator.getHasOriginPlace());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

