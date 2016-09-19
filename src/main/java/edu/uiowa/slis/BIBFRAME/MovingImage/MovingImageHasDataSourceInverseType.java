package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageHasDataSourceInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageHasDataSourceInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageHasDataSourceInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageHasDataSourceInverseIterator theMovingImageHasDataSourceInverseIterator = (MovingImageHasDataSourceInverseIterator)findAncestorWithClass(this, MovingImageHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theMovingImageHasDataSourceInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

