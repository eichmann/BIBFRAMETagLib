package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MovingImageFormDesignationIterator theMovingImage = (MovingImageFormDesignationIterator)findAncestorWithClass(this, MovingImageFormDesignationIterator.class);
			pageContext.getOut().print(theMovingImage.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

