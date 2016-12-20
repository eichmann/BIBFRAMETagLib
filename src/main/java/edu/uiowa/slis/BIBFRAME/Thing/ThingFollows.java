package edu.uiowa.slis.BIBFRAME.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingFollows extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThingFollows currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingFollows.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingFollowsIterator theThingFollowsIterator = (ThingFollowsIterator)findAncestorWithClass(this, ThingFollowsIterator.class);
			pageContext.getOut().print(theThingFollowsIterator.getFollows());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for follows tag ");
		}
		return SKIP_BODY;
	}
}

