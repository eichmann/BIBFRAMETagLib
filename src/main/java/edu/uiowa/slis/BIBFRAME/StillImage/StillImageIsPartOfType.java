package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageIsPartOfIterator theStillImageIsPartOfIterator = (StillImageIsPartOfIterator)findAncestorWithClass(this, StillImageIsPartOfIterator.class);
			pageContext.getOut().print(theStillImageIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

