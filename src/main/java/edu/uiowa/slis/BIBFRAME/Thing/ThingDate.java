package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingDate currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingDateIterator theThing = (ThingDateIterator)findAncestorWithClass(this, ThingDateIterator.class);
			pageContext.getOut().print(theThing.getDate());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for date tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for date tag ");
		}
		return SKIP_BODY;
	}
}

