package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageReceivedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageReceivedType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageReceivedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageReceivedIterator theStillImageReceivedIterator = (StillImageReceivedIterator)findAncestorWithClass(this, StillImageReceivedIterator.class);
			pageContext.getOut().print(theStillImageReceivedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for received tag ");
		}
		return SKIP_BODY;
	}
}

