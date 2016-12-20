package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingAtLocation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingAtLocation currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingAtLocation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingAtLocationIterator theThingAtLocationIterator = (ThingAtLocationIterator)findAncestorWithClass(this, ThingAtLocationIterator.class);
			pageContext.getOut().print(theThingAtLocationIterator.getAtLocation());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for atLocation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for atLocation tag ");
		}
		return SKIP_BODY;
	}
}

