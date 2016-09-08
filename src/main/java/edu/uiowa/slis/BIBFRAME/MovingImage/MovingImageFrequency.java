package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageFrequency extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageFrequency currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageFrequency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MovingImageFrequencyIterator theMovingImage = (MovingImageFrequencyIterator)findAncestorWithClass(this, MovingImageFrequencyIterator.class);
			pageContext.getOut().print(theMovingImage.getFrequency());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for frequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for frequency tag ");
		}
		return SKIP_BODY;
	}
}

