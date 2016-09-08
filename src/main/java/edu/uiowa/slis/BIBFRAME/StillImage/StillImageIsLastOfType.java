package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageIsLastOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageIsLastOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageIsLastOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageIsLastOfIterator theStillImageIsLastOfIterator = (StillImageIsLastOfIterator)findAncestorWithClass(this, StillImageIsLastOfIterator.class);
			pageContext.getOut().print(theStillImageIsLastOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

