package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingBottomObjectPropertyInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingBottomObjectPropertyInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingBottomObjectPropertyInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingBottomObjectPropertyInverseIterator theThingBottomObjectPropertyInverseIterator = (ThingBottomObjectPropertyInverseIterator)findAncestorWithClass(this, ThingBottomObjectPropertyInverseIterator.class);
			pageContext.getOut().print(theThingBottomObjectPropertyInverseIterator.getBottomObjectPropertyInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

