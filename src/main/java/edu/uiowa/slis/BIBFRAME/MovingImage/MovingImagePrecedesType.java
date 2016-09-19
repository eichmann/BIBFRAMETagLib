package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImagePrecedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImagePrecedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImagePrecedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImagePrecedesIterator theMovingImagePrecedesIterator = (MovingImagePrecedesIterator)findAncestorWithClass(this, MovingImagePrecedesIterator.class);
			pageContext.getOut().print(theMovingImagePrecedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for precedes tag ");
		}
		return SKIP_BODY;
	}
}

