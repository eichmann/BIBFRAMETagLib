package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageSupplements extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageSupplements currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageSupplements.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageSupplementsIterator theMovingImageSupplementsIterator = (MovingImageSupplementsIterator)findAncestorWithClass(this, MovingImageSupplementsIterator.class);
			pageContext.getOut().print(theMovingImageSupplementsIterator.getSupplements());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for supplements tag ");
		}
		return SKIP_BODY;
	}
}

