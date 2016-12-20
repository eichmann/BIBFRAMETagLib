package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingInScheme extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingInScheme currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingInScheme.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingInSchemeIterator theThingInSchemeIterator = (ThingInSchemeIterator)findAncestorWithClass(this, ThingInSchemeIterator.class);
			pageContext.getOut().print(theThingInSchemeIterator.getInScheme());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for inScheme tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for inScheme tag ");
		}
		return SKIP_BODY;
	}
}

