package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageHasInstance extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageHasInstance currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageHasInstance.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageHasInstanceIterator theMovingImageHasInstanceIterator = (MovingImageHasInstanceIterator)findAncestorWithClass(this, MovingImageHasInstanceIterator.class);
			pageContext.getOut().print(theMovingImageHasInstanceIterator.getHasInstance());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

