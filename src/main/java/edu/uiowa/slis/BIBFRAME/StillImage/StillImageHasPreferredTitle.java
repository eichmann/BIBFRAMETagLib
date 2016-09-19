package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageHasPreferredTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageHasPreferredTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageHasPreferredTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageHasPreferredTitleIterator theStillImageHasPreferredTitleIterator = (StillImageHasPreferredTitleIterator)findAncestorWithClass(this, StillImageHasPreferredTitleIterator.class);
			pageContext.getOut().print(theStillImageHasPreferredTitleIterator.getHasPreferredTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

