package edu.uiowa.slis.BIBFRAME.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalTranslatedAsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static JournalTranslatedAsType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalTranslatedAsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalTranslatedAsIterator theJournalTranslatedAsIterator = (JournalTranslatedAsIterator)findAncestorWithClass(this, JournalTranslatedAsIterator.class);
			pageContext.getOut().print(theJournalTranslatedAsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}
