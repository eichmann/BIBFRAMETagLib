package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingInSchemeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingInSchemeType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingInSchemeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingInSchemeIterator theThingInSchemeIterator = (ThingInSchemeIterator)findAncestorWithClass(this, ThingInSchemeIterator.class);
			pageContext.getOut().print(theThingInSchemeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for inScheme tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for inScheme tag ");
		}
		return SKIP_BODY;
	}
}

