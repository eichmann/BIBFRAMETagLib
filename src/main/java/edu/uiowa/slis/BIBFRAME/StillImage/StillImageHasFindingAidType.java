package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageHasFindingAidType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageHasFindingAidType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageHasFindingAidType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageHasFindingAidIterator theStillImageHasFindingAidIterator = (StillImageHasFindingAidIterator)findAncestorWithClass(this, StillImageHasFindingAidIterator.class);
			pageContext.getOut().print(theStillImageHasFindingAidIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}

