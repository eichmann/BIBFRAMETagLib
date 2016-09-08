package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageContinuedUnderNewTitleBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageContinuedUnderNewTitleBy currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageContinuedUnderNewTitleBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageContinuedUnderNewTitleByIterator theMovingImageContinuedUnderNewTitleByIterator = (MovingImageContinuedUnderNewTitleByIterator)findAncestorWithClass(this, MovingImageContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theMovingImageContinuedUnderNewTitleByIterator.getContinuedUnderNewTitleBy());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

