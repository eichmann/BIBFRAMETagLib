package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageHasPreferredTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageHasPreferredTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageHasPreferredTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageHasPreferredTitleIterator theStillImageHasPreferredTitleIterator = (StillImageHasPreferredTitleIterator)findAncestorWithClass(this, StillImageHasPreferredTitleIterator.class);
			pageContext.getOut().print(theStillImageHasPreferredTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

