package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageHasSupplement extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageHasSupplement currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageHasSupplement.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageHasSupplementIterator theMovingImageHasSupplementIterator = (MovingImageHasSupplementIterator)findAncestorWithClass(this, MovingImageHasSupplementIterator.class);
			pageContext.getOut().print(theMovingImageHasSupplementIterator.getHasSupplement());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

