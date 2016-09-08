package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageTranslates extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageTranslates currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageTranslates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageTranslatesIterator theStillImageTranslatesIterator = (StillImageTranslatesIterator)findAncestorWithClass(this, StillImageTranslatesIterator.class);
			pageContext.getOut().print(theStillImageTranslatesIterator.getTranslates());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for translates tag ");
		}
		return SKIP_BODY;
	}
}

