package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageRelationIterator theMovingImageRelationIterator = (MovingImageRelationIterator)findAncestorWithClass(this, MovingImageRelationIterator.class);
			pageContext.getOut().print(theMovingImageRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for relation tag ");
		}
		return SKIP_BODY;
	}
}

