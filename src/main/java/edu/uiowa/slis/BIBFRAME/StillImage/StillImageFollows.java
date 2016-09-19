package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageFollows extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageFollows currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageFollows.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageFollowsIterator theStillImageFollowsIterator = (StillImageFollowsIterator)findAncestorWithClass(this, StillImageFollowsIterator.class);
			pageContext.getOut().print(theStillImageFollowsIterator.getFollows());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for follows tag ");
		}
		return SKIP_BODY;
	}
}

