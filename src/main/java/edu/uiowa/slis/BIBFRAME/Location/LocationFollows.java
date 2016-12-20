package edu.uiowa.slis.BIBFRAME.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationFollows extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LocationFollows currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationFollows.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationFollowsIterator theLocationFollowsIterator = (LocationFollowsIterator)findAncestorWithClass(this, LocationFollowsIterator.class);
			pageContext.getOut().print(theLocationFollowsIterator.getFollows());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for follows tag ");
		}
		return SKIP_BODY;
	}
}

