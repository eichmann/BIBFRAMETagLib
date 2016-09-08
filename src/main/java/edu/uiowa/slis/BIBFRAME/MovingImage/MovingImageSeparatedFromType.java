package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageSeparatedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageSeparatedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageSeparatedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageSeparatedFromIterator theMovingImageSeparatedFromIterator = (MovingImageSeparatedFromIterator)findAncestorWithClass(this, MovingImageSeparatedFromIterator.class);
			pageContext.getOut().print(theMovingImageSeparatedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

