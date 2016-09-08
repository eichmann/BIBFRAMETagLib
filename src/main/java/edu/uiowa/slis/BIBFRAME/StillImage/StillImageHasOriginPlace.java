package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageHasOriginPlace extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageHasOriginPlace currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageHasOriginPlace.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageHasOriginPlaceIterator theStillImageHasOriginPlaceIterator = (StillImageHasOriginPlaceIterator)findAncestorWithClass(this, StillImageHasOriginPlaceIterator.class);
			pageContext.getOut().print(theStillImageHasOriginPlaceIterator.getHasOriginPlace());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

