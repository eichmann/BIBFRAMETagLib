package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageSeparatedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageSeparatedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageSeparatedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageSeparatedFromIterator theStillImageSeparatedFromIterator = (StillImageSeparatedFromIterator)findAncestorWithClass(this, StillImageSeparatedFromIterator.class);
			pageContext.getOut().print(theStillImageSeparatedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

