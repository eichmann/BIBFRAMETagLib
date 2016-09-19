package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImagePrecedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImagePrecedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImagePrecedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImagePrecedesIterator theStillImagePrecedesIterator = (StillImagePrecedesIterator)findAncestorWithClass(this, StillImagePrecedesIterator.class);
			pageContext.getOut().print(theStillImagePrecedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for precedes tag ");
		}
		return SKIP_BODY;
	}
}

