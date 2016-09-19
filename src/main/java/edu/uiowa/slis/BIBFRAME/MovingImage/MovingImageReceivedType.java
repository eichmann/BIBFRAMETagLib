package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageReceivedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageReceivedType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageReceivedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageReceivedIterator theMovingImageReceivedIterator = (MovingImageReceivedIterator)findAncestorWithClass(this, MovingImageReceivedIterator.class);
			pageContext.getOut().print(theMovingImageReceivedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for received tag ");
		}
		return SKIP_BODY;
	}
}

