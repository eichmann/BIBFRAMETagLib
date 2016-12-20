package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingIsBodyOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingIsBodyOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingIsBodyOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingIsBodyOfIterator theThingIsBodyOfIterator = (ThingIsBodyOfIterator)findAncestorWithClass(this, ThingIsBodyOfIterator.class);
			pageContext.getOut().print(theThingIsBodyOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for isBodyOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for isBodyOf tag ");
		}
		return SKIP_BODY;
	}
}

