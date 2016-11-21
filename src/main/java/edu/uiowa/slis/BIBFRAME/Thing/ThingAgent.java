package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingAgent extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingAgent currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingAgent.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingAgentIterator theThingAgentIterator = (ThingAgentIterator)findAncestorWithClass(this, ThingAgentIterator.class);
			pageContext.getOut().print(theThingAgentIterator.getAgent());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for agent tag ");
		}
		return SKIP_BODY;
	}
}

