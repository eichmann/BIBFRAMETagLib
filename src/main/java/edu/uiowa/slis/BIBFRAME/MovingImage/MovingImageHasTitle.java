package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageHasTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageHasTitleIterator theMovingImageHasTitleIterator = (MovingImageHasTitleIterator)findAncestorWithClass(this, MovingImageHasTitleIterator.class);
			pageContext.getOut().print(theMovingImageHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

