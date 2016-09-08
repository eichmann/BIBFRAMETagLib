package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageContinuesUnderNewTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageContinuesUnderNewTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageContinuesUnderNewTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageContinuesUnderNewTitleIterator theMovingImageContinuesUnderNewTitleIterator = (MovingImageContinuesUnderNewTitleIterator)findAncestorWithClass(this, MovingImageContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theMovingImageContinuesUnderNewTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

