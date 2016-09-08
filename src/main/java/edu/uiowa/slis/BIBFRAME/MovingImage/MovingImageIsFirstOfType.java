package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageIsFirstOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageIsFirstOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageIsFirstOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageIsFirstOfIterator theMovingImageIsFirstOfIterator = (MovingImageIsFirstOfIterator)findAncestorWithClass(this, MovingImageIsFirstOfIterator.class);
			pageContext.getOut().print(theMovingImageIsFirstOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

