package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventLanguageType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EventLanguageType currentInstance = null;
	private static final Log log = LogFactory.getLog(EventLanguageType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventLanguageIterator theEventLanguageIterator = (EventLanguageIterator)findAncestorWithClass(this, EventLanguageIterator.class);
			pageContext.getOut().print(theEventLanguageIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for language tag ");
		}
		return SKIP_BODY;
	}
}

