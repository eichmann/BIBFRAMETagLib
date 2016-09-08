package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImagePerformedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImagePerformedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImagePerformedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImagePerformedAtIterator theMovingImagePerformedAtIterator = (MovingImagePerformedAtIterator)findAncestorWithClass(this, MovingImagePerformedAtIterator.class);
			pageContext.getOut().print(theMovingImagePerformedAtIterator.getPerformedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

