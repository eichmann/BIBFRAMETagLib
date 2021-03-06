package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageHasPartIterator theStillImageHasPartIterator = (StillImageHasPartIterator)findAncestorWithClass(this, StillImageHasPartIterator.class);
			pageContext.getOut().print(theStillImageHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

