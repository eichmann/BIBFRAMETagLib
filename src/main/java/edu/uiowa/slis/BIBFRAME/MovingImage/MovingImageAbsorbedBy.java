package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageAbsorbedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageAbsorbedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageAbsorbedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageAbsorbedByIterator theMovingImageAbsorbedByIterator = (MovingImageAbsorbedByIterator)findAncestorWithClass(this, MovingImageAbsorbedByIterator.class);
			pageContext.getOut().print(theMovingImageAbsorbedByIterator.getAbsorbedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

