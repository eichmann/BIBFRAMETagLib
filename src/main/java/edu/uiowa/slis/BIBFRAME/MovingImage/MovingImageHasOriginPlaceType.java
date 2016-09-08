package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageHasOriginPlaceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageHasOriginPlaceType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageHasOriginPlaceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageHasOriginPlaceIterator theMovingImageHasOriginPlaceIterator = (MovingImageHasOriginPlaceIterator)findAncestorWithClass(this, MovingImageHasOriginPlaceIterator.class);
			pageContext.getOut().print(theMovingImageHasOriginPlaceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

