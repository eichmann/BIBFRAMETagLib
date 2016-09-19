package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageHasOtherEditionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageHasOtherEditionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageHasOtherEditionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageHasOtherEditionInverseIterator theMovingImageHasOtherEditionInverseIterator = (MovingImageHasOtherEditionInverseIterator)findAncestorWithClass(this, MovingImageHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theMovingImageHasOtherEditionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

