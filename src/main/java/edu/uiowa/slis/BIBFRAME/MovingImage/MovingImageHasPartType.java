package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageHasPartIterator theMovingImageHasPartIterator = (MovingImageHasPartIterator)findAncestorWithClass(this, MovingImageHasPartIterator.class);
			pageContext.getOut().print(theMovingImageHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

