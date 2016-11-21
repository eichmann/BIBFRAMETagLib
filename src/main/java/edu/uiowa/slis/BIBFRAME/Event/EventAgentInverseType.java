package edu.uiowa.slis.BIBFRAME.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EventAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(EventAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventAgentInverseIterator theEventAgentInverseIterator = (EventAgentInverseIterator)findAncestorWithClass(this, EventAgentInverseIterator.class);
			pageContext.getOut().print(theEventAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for agent tag ");
		}
		return SKIP_BODY;
	}
}

