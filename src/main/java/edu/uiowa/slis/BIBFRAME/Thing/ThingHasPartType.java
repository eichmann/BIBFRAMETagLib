package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingHasPartIterator theThingHasPartIterator = (ThingHasPartIterator)findAncestorWithClass(this, ThingHasPartIterator.class);
			pageContext.getOut().print(theThingHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

