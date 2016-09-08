package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageContinuedUnderNewTitleBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageContinuedUnderNewTitleBy currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageContinuedUnderNewTitleBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageContinuedUnderNewTitleByIterator theStillImageContinuedUnderNewTitleByIterator = (StillImageContinuedUnderNewTitleByIterator)findAncestorWithClass(this, StillImageContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theStillImageContinuedUnderNewTitleByIterator.getContinuedUnderNewTitleBy());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

