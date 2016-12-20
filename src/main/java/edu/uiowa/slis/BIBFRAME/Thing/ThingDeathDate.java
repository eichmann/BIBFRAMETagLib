package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingDeathDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingDeathDate currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingDeathDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingDeathDateIterator theThing = (ThingDeathDateIterator)findAncestorWithClass(this, ThingDeathDateIterator.class);
			pageContext.getOut().print(theThing.getDeathDate());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for deathDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for deathDate tag ");
		}
		return SKIP_BODY;
	}
}

