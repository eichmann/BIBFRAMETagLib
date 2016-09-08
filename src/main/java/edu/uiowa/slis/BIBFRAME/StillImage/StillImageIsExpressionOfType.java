package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageIsExpressionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageIsExpressionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageIsExpressionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageIsExpressionOfIterator theStillImageIsExpressionOfIterator = (StillImageIsExpressionOfIterator)findAncestorWithClass(this, StillImageIsExpressionOfIterator.class);
			pageContext.getOut().print(theStillImageIsExpressionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

