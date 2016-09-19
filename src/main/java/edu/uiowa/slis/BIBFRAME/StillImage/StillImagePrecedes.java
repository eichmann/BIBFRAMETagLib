package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImagePrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImagePrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImagePrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImagePrecedesIterator theStillImagePrecedesIterator = (StillImagePrecedesIterator)findAncestorWithClass(this, StillImagePrecedesIterator.class);
			pageContext.getOut().print(theStillImagePrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for precedes tag ");
		}
		return SKIP_BODY;
	}
}

