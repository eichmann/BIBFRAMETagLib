package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingHasSourceStatusType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingHasSourceStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingHasSourceStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingHasSourceStatusIterator theThingHasSourceStatusIterator = (ThingHasSourceStatusIterator)findAncestorWithClass(this, ThingHasSourceStatusIterator.class);
			pageContext.getOut().print(theThingHasSourceStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for hasSourceStatus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for hasSourceStatus tag ");
		}
		return SKIP_BODY;
	}
}

