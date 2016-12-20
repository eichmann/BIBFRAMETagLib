package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageAccompaniedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageAccompaniedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageAccompaniedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageAccompaniedByIterator theMovingImageAccompaniedByIterator = (MovingImageAccompaniedByIterator)findAncestorWithClass(this, MovingImageAccompaniedByIterator.class);
			pageContext.getOut().print(theMovingImageAccompaniedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}

