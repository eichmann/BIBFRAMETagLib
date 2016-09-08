package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageHasInstanceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageHasInstanceType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageHasInstanceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageHasInstanceIterator theMovingImageHasInstanceIterator = (MovingImageHasInstanceIterator)findAncestorWithClass(this, MovingImageHasInstanceIterator.class);
			pageContext.getOut().print(theMovingImageHasInstanceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

