package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageSeparatedInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageSeparatedInto currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageSeparatedInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageSeparatedIntoIterator theMovingImageSeparatedIntoIterator = (MovingImageSeparatedIntoIterator)findAncestorWithClass(this, MovingImageSeparatedIntoIterator.class);
			pageContext.getOut().print(theMovingImageSeparatedIntoIterator.getSeparatedInto());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

