package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageHasDataSourceInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageHasDataSourceInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageHasDataSourceInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageHasDataSourceInverseIterator theStillImageHasDataSourceInverseIterator = (StillImageHasDataSourceInverseIterator)findAncestorWithClass(this, StillImageHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theStillImageHasDataSourceInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

