package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageRelationIterator theMovingImageRelationIterator = (MovingImageRelationIterator)findAncestorWithClass(this, MovingImageRelationIterator.class);
			pageContext.getOut().print(theMovingImageRelationIterator.getRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for relation tag ");
		}
		return SKIP_BODY;
	}
}

