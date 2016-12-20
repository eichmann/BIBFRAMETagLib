package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageAccompaniedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageAccompaniedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageAccompaniedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageAccompaniedByIterator theMovingImageAccompaniedByIterator = (MovingImageAccompaniedByIterator)findAncestorWithClass(this, MovingImageAccompaniedByIterator.class);
			pageContext.getOut().print(theMovingImageAccompaniedByIterator.getAccompaniedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}

