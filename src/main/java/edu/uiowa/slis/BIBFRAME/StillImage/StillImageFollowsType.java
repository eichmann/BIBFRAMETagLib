package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageFollowsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageFollowsType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageFollowsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageFollowsIterator theStillImageFollowsIterator = (StillImageFollowsIterator)findAncestorWithClass(this, StillImageFollowsIterator.class);
			pageContext.getOut().print(theStillImageFollowsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for follows tag ");
		}
		return SKIP_BODY;
	}
}

