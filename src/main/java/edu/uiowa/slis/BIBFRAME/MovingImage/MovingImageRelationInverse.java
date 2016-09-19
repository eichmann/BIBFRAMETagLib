package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageRelationInverseIterator theMovingImageRelationInverseIterator = (MovingImageRelationInverseIterator)findAncestorWithClass(this, MovingImageRelationInverseIterator.class);
			pageContext.getOut().print(theMovingImageRelationInverseIterator.getRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for relation tag ");
		}
		return SKIP_BODY;
	}
}

