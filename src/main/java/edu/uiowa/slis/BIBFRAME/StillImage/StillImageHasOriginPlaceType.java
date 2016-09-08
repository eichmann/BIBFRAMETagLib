package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageHasOriginPlaceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageHasOriginPlaceType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageHasOriginPlaceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageHasOriginPlaceIterator theStillImageHasOriginPlaceIterator = (StillImageHasOriginPlaceIterator)findAncestorWithClass(this, StillImageHasOriginPlaceIterator.class);
			pageContext.getOut().print(theStillImageHasOriginPlaceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

