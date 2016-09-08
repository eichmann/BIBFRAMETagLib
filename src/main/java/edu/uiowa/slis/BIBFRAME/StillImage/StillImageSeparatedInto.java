package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageSeparatedInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageSeparatedInto currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageSeparatedInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageSeparatedIntoIterator theStillImageSeparatedIntoIterator = (StillImageSeparatedIntoIterator)findAncestorWithClass(this, StillImageSeparatedIntoIterator.class);
			pageContext.getOut().print(theStillImageSeparatedIntoIterator.getSeparatedInto());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

