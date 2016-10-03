package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingTopObjectPropertyInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingTopObjectPropertyInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingTopObjectPropertyInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingTopObjectPropertyInverseIterator theThingTopObjectPropertyInverseIterator = (ThingTopObjectPropertyInverseIterator)findAncestorWithClass(this, ThingTopObjectPropertyInverseIterator.class);
			pageContext.getOut().print(theThingTopObjectPropertyInverseIterator.getTopObjectPropertyInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

