package edu.uiowa.slis.BIBFRAME.MovingImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MovingImageHasDataSource extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MovingImageHasDataSource currentInstance = null;
	private static final Log log = LogFactory.getLog(MovingImageHasDataSource.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MovingImageHasDataSourceIterator theMovingImageHasDataSourceIterator = (MovingImageHasDataSourceIterator)findAncestorWithClass(this, MovingImageHasDataSourceIterator.class);
			pageContext.getOut().print(theMovingImageHasDataSourceIterator.getHasDataSource());
		} catch (Exception e) {
			log.error("Can't find enclosing MovingImage for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing MovingImage for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

