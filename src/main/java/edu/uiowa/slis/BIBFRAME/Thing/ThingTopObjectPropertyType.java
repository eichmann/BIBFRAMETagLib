package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingTopObjectPropertyType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingTopObjectPropertyType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingTopObjectPropertyType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingTopObjectPropertyIterator theThingTopObjectPropertyIterator = (ThingTopObjectPropertyIterator)findAncestorWithClass(this, ThingTopObjectPropertyIterator.class);
			pageContext.getOut().print(theThingTopObjectPropertyIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

