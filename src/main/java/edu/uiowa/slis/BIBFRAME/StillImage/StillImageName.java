package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageName extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageName currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StillImageNameIterator theStillImage = (StillImageNameIterator)findAncestorWithClass(this, StillImageNameIterator.class);
			pageContext.getOut().print(theStillImage.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for name tag ");
		}
		return SKIP_BODY;
	}
}

