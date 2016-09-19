package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageHasPreferredTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageHasPreferredTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageHasPreferredTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageHasPreferredTitleIterator theMovingImageHasPreferredTitleIterator = (MovingImageHasPreferredTitleIterator)findAncestorWithClass(this, MovingImageHasPreferredTitleIterator.class);
			pageContext.getOut().print(theMovingImageHasPreferredTitleIterator.getHasPreferredTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

