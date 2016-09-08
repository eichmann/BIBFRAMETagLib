package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageIsFindingAidFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageIsFindingAidFor currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageIsFindingAidFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageIsFindingAidForIterator theMovingImageIsFindingAidForIterator = (MovingImageIsFindingAidForIterator)findAncestorWithClass(this, MovingImageIsFindingAidForIterator.class);
			pageContext.getOut().print(theMovingImageIsFindingAidForIterator.getIsFindingAidFor());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

