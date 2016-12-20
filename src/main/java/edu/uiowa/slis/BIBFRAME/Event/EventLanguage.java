package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventLanguage extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EventLanguage currentInstance = null;
	private static final Log log = LogFactory.getLog(EventLanguage.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventLanguageIterator theEventLanguageIterator = (EventLanguageIterator)findAncestorWithClass(this, EventLanguageIterator.class);
			pageContext.getOut().print(theEventLanguageIterator.getLanguage());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for language tag ");
		}
		return SKIP_BODY;
	}
}

