package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageSeparatedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageSeparatedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageSeparatedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageSeparatedFromIterator theStillImageSeparatedFromIterator = (StillImageSeparatedFromIterator)findAncestorWithClass(this, StillImageSeparatedFromIterator.class);
			pageContext.getOut().print(theStillImageSeparatedFromIterator.getSeparatedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

