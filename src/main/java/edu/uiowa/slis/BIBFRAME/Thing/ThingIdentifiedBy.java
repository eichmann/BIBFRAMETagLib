package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingIdentifiedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingIdentifiedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingIdentifiedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingIdentifiedByIterator theThingIdentifiedByIterator = (ThingIdentifiedByIterator)findAncestorWithClass(this, ThingIdentifiedByIterator.class);
			pageContext.getOut().print(theThingIdentifiedByIterator.getIdentifiedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

