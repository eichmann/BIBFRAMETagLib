package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageIsLastOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageIsLastOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageIsLastOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageIsLastOfIterator theMovingImageIsLastOfIterator = (MovingImageIsLastOfIterator)findAncestorWithClass(this, MovingImageIsLastOfIterator.class);
			pageContext.getOut().print(theMovingImageIsLastOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

