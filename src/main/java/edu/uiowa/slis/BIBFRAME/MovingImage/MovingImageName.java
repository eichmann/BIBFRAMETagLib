package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageName extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageName currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MovingImageNameIterator theMovingImage = (MovingImageNameIterator)findAncestorWithClass(this, MovingImageNameIterator.class);
			pageContext.getOut().print(theMovingImage.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for name tag ");
		}
		return SKIP_BODY;
	}
}

