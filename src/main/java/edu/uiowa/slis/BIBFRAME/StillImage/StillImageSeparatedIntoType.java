package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageSeparatedIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageSeparatedIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageSeparatedIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageSeparatedIntoIterator theStillImageSeparatedIntoIterator = (StillImageSeparatedIntoIterator)findAncestorWithClass(this, StillImageSeparatedIntoIterator.class);
			pageContext.getOut().print(theStillImageSeparatedIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

