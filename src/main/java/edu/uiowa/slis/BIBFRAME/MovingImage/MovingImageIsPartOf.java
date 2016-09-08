package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageIsPartOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageIsPartOf currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageIsPartOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageIsPartOfIterator theMovingImageIsPartOfIterator = (MovingImageIsPartOfIterator)findAncestorWithClass(this, MovingImageIsPartOfIterator.class);
			pageContext.getOut().print(theMovingImageIsPartOfIterator.getIsPartOf());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

