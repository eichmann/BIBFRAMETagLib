package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageHasOtherEdition extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageHasOtherEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageHasOtherEdition.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageHasOtherEditionIterator theMovingImageHasOtherEditionIterator = (MovingImageHasOtherEditionIterator)findAncestorWithClass(this, MovingImageHasOtherEditionIterator.class);
			pageContext.getOut().print(theMovingImageHasOtherEditionIterator.getHasOtherEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

