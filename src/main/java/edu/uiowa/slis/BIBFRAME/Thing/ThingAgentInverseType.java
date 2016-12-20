package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingAgentInverseIterator theThingAgentInverseIterator = (ThingAgentInverseIterator)findAncestorWithClass(this, ThingAgentInverseIterator.class);
			pageContext.getOut().print(theThingAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for agent tag ");
		}
		return SKIP_BODY;
	}
}

