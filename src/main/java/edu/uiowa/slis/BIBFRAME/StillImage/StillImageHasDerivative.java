package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageHasDerivative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageHasDerivative currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageHasDerivative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageHasDerivativeIterator theStillImageHasDerivativeIterator = (StillImageHasDerivativeIterator)findAncestorWithClass(this, StillImageHasDerivativeIterator.class);
			pageContext.getOut().print(theStillImageHasDerivativeIterator.getHasDerivative());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

