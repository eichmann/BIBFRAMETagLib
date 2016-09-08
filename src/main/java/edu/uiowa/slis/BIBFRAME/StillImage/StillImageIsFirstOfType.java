package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageIsFirstOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageIsFirstOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageIsFirstOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageIsFirstOfIterator theStillImageIsFirstOfIterator = (StillImageIsFirstOfIterator)findAncestorWithClass(this, StillImageIsFirstOfIterator.class);
			pageContext.getOut().print(theStillImageIsFirstOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

