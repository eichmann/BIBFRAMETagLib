package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageSplitIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageSplitIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageSplitIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageSplitIntoIterator theStillImageSplitIntoIterator = (StillImageSplitIntoIterator)findAncestorWithClass(this, StillImageSplitIntoIterator.class);
			pageContext.getOut().print(theStillImageSplitIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

