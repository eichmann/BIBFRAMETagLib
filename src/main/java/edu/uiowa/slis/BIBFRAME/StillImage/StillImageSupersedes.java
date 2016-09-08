package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageSupersedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageSupersedes currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageSupersedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageSupersedesIterator theStillImageSupersedesIterator = (StillImageSupersedesIterator)findAncestorWithClass(this, StillImageSupersedesIterator.class);
			pageContext.getOut().print(theStillImageSupersedesIterator.getSupersedes());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

