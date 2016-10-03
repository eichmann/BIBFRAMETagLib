package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingIdentifiedByIterator theThingIdentifiedByIterator = (ThingIdentifiedByIterator)findAncestorWithClass(this, ThingIdentifiedByIterator.class);
			pageContext.getOut().print(theThingIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

