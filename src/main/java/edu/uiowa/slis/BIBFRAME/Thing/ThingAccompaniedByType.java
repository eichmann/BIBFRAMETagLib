package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingAccompaniedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingAccompaniedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingAccompaniedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingAccompaniedByIterator theThingAccompaniedByIterator = (ThingAccompaniedByIterator)findAncestorWithClass(this, ThingAccompaniedByIterator.class);
			pageContext.getOut().print(theThingAccompaniedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}
