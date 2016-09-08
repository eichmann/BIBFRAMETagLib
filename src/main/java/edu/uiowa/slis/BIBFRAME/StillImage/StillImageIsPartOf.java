package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageIsPartOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageIsPartOf currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageIsPartOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageIsPartOfIterator theStillImageIsPartOfIterator = (StillImageIsPartOfIterator)findAncestorWithClass(this, StillImageIsPartOfIterator.class);
			pageContext.getOut().print(theStillImageIsPartOfIterator.getIsPartOf());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

