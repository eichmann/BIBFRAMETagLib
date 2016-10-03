package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingBottomObjectPropertyType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingBottomObjectPropertyType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingBottomObjectPropertyType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingBottomObjectPropertyIterator theThingBottomObjectPropertyIterator = (ThingBottomObjectPropertyIterator)findAncestorWithClass(this, ThingBottomObjectPropertyIterator.class);
			pageContext.getOut().print(theThingBottomObjectPropertyIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

