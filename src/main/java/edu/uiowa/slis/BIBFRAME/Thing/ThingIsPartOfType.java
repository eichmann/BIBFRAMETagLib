package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingIsPartOfIterator theThingIsPartOfIterator = (ThingIsPartOfIterator)findAncestorWithClass(this, ThingIsPartOfIterator.class);
			pageContext.getOut().print(theThingIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

