package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageHasOriginalVersionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageHasOriginalVersionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageHasOriginalVersionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageHasOriginalVersionInverseIterator theStillImageHasOriginalVersionInverseIterator = (StillImageHasOriginalVersionInverseIterator)findAncestorWithClass(this, StillImageHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theStillImageHasOriginalVersionInverseIterator.getHasOriginalVersionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

