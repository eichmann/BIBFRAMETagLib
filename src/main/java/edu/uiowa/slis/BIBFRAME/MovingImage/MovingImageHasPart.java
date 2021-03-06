package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageHasPartIterator theMovingImageHasPartIterator = (MovingImageHasPartIterator)findAncestorWithClass(this, MovingImageHasPartIterator.class);
			pageContext.getOut().print(theMovingImageHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

