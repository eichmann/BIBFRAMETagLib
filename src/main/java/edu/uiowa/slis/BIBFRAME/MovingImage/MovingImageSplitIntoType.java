package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageSplitIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageSplitIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageSplitIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageSplitIntoIterator theMovingImageSplitIntoIterator = (MovingImageSplitIntoIterator)findAncestorWithClass(this, MovingImageSplitIntoIterator.class);
			pageContext.getOut().print(theMovingImageSplitIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

