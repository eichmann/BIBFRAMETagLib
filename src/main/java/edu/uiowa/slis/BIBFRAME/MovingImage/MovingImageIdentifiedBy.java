package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageIdentifiedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageIdentifiedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageIdentifiedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageIdentifiedByIterator theMovingImageIdentifiedByIterator = (MovingImageIdentifiedByIterator)findAncestorWithClass(this, MovingImageIdentifiedByIterator.class);
			pageContext.getOut().print(theMovingImageIdentifiedByIterator.getIdentifiedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

