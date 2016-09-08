package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageHasFindingAid extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageHasFindingAid currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageHasFindingAid.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageHasFindingAidIterator theMovingImageHasFindingAidIterator = (MovingImageHasFindingAidIterator)findAncestorWithClass(this, MovingImageHasFindingAidIterator.class);
			pageContext.getOut().print(theMovingImageHasFindingAidIterator.getHasFindingAid());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}

