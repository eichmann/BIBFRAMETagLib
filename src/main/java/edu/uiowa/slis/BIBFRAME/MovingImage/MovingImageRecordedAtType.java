package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageRecordedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageRecordedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageRecordedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageRecordedAtIterator theMovingImageRecordedAtIterator = (MovingImageRecordedAtIterator)findAncestorWithClass(this, MovingImageRecordedAtIterator.class);
			pageContext.getOut().print(theMovingImageRecordedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

