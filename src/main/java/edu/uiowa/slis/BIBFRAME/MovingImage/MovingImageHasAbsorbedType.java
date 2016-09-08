package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageHasAbsorbedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageHasAbsorbedType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageHasAbsorbedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageHasAbsorbedIterator theMovingImageHasAbsorbedIterator = (MovingImageHasAbsorbedIterator)findAncestorWithClass(this, MovingImageHasAbsorbedIterator.class);
			pageContext.getOut().print(theMovingImageHasAbsorbedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

