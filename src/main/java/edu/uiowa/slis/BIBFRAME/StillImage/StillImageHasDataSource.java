package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageHasDataSource extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageHasDataSource currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageHasDataSource.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageHasDataSourceIterator theStillImageHasDataSourceIterator = (StillImageHasDataSourceIterator)findAncestorWithClass(this, StillImageHasDataSourceIterator.class);
			pageContext.getOut().print(theStillImageHasDataSourceIterator.getHasDataSource());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

