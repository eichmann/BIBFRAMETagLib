package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageSupersededBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageSupersededBy currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageSupersededBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageSupersededByIterator theMovingImageSupersededByIterator = (MovingImageSupersededByIterator)findAncestorWithClass(this, MovingImageSupersededByIterator.class);
			pageContext.getOut().print(theMovingImageSupersededByIterator.getSupersededBy());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

