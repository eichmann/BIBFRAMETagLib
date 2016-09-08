package edu.uiowa.slis.BIBFRAME.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConferenceIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceIdentifiedByIterator theConferenceIdentifiedByIterator = (ConferenceIdentifiedByIterator)findAncestorWithClass(this, ConferenceIdentifiedByIterator.class);
			pageContext.getOut().print(theConferenceIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

