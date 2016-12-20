package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingPrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingPrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingPrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingPrecedesIterator theThingPrecedesIterator = (ThingPrecedesIterator)findAncestorWithClass(this, ThingPrecedesIterator.class);
			pageContext.getOut().print(theThingPrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for precedes tag ");
		}
		return SKIP_BODY;
	}
}

