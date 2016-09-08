package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageHasSupplementType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageHasSupplementType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageHasSupplementType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageHasSupplementIterator theStillImageHasSupplementIterator = (StillImageHasSupplementIterator)findAncestorWithClass(this, StillImageHasSupplementIterator.class);
			pageContext.getOut().print(theStillImageHasSupplementIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

