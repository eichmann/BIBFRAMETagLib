package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageHasOriginalVersionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageHasOriginalVersionType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageHasOriginalVersionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageHasOriginalVersionIterator theStillImageHasOriginalVersionIterator = (StillImageHasOriginalVersionIterator)findAncestorWithClass(this, StillImageHasOriginalVersionIterator.class);
			pageContext.getOut().print(theStillImageHasOriginalVersionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

