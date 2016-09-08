package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImagePerformedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImagePerformedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImagePerformedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImagePerformedAtIterator theMovingImagePerformedAtIterator = (MovingImagePerformedAtIterator)findAncestorWithClass(this, MovingImagePerformedAtIterator.class);
			pageContext.getOut().print(theMovingImagePerformedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

