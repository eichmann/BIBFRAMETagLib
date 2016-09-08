package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageIsUnionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageIsUnionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageIsUnionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageIsUnionOfIterator theMovingImageIsUnionOfIterator = (MovingImageIsUnionOfIterator)findAncestorWithClass(this, MovingImageIsUnionOfIterator.class);
			pageContext.getOut().print(theMovingImageIsUnionOfIterator.getIsUnionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

