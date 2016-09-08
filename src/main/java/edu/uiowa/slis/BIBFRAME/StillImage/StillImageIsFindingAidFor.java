package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageIsFindingAidFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageIsFindingAidFor currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageIsFindingAidFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageIsFindingAidForIterator theStillImageIsFindingAidForIterator = (StillImageIsFindingAidForIterator)findAncestorWithClass(this, StillImageIsFindingAidForIterator.class);
			pageContext.getOut().print(theStillImageIsFindingAidForIterator.getIsFindingAidFor());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

