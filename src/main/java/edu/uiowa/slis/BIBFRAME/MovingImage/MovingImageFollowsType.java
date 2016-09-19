package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageFollowsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageFollowsType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageFollowsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageFollowsIterator theMovingImageFollowsIterator = (MovingImageFollowsIterator)findAncestorWithClass(this, MovingImageFollowsIterator.class);
			pageContext.getOut().print(theMovingImageFollowsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for follows tag ");
		}
		return SKIP_BODY;
	}
}

