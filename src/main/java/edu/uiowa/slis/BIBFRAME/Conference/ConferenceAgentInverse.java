package edu.uiowa.slis.BIBFRAME.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceAgentInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConferenceAgentInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceAgentInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceAgentInverseIterator theConferenceAgentInverseIterator = (ConferenceAgentInverseIterator)findAncestorWithClass(this, ConferenceAgentInverseIterator.class);
			pageContext.getOut().print(theConferenceAgentInverseIterator.getAgentInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for agent tag ");
		}
		return SKIP_BODY;
	}
}

