package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageHasFindingAid extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageHasFindingAid currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageHasFindingAid.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageHasFindingAidIterator theStillImageHasFindingAidIterator = (StillImageHasFindingAidIterator)findAncestorWithClass(this, StillImageHasFindingAidIterator.class);
			pageContext.getOut().print(theStillImageHasFindingAidIterator.getHasFindingAid());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}

