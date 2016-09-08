package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageSupersededByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageSupersededByType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageSupersededByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageSupersededByIterator theMovingImageSupersededByIterator = (MovingImageSupersededByIterator)findAncestorWithClass(this, MovingImageSupersededByIterator.class);
			pageContext.getOut().print(theMovingImageSupersededByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

