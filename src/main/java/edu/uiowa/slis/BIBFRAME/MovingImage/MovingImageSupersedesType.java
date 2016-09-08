package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageSupersedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageSupersedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageSupersedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageSupersedesIterator theMovingImageSupersedesIterator = (MovingImageSupersedesIterator)findAncestorWithClass(this, MovingImageSupersedesIterator.class);
			pageContext.getOut().print(theMovingImageSupersedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

