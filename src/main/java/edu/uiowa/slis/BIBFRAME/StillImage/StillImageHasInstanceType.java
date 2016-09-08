package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageHasInstanceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageHasInstanceType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageHasInstanceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageHasInstanceIterator theStillImageHasInstanceIterator = (StillImageHasInstanceIterator)findAncestorWithClass(this, StillImageHasInstanceIterator.class);
			pageContext.getOut().print(theStillImageHasInstanceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

