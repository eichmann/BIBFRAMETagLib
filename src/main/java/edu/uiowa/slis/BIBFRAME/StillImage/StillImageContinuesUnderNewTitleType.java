package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageContinuesUnderNewTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageContinuesUnderNewTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageContinuesUnderNewTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageContinuesUnderNewTitleIterator theStillImageContinuesUnderNewTitleIterator = (StillImageContinuesUnderNewTitleIterator)findAncestorWithClass(this, StillImageContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theStillImageContinuesUnderNewTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

