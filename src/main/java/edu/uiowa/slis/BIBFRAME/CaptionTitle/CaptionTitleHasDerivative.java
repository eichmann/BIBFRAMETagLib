package edu.uiowa.slis.BIBFRAME.CaptionTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaptionTitleHasDerivative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CaptionTitleHasDerivative currentInstance = null;
	private static final Log log = LogFactory.getLog(CaptionTitleHasDerivative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaptionTitleHasDerivativeIterator theCaptionTitleHasDerivativeIterator = (CaptionTitleHasDerivativeIterator)findAncestorWithClass(this, CaptionTitleHasDerivativeIterator.class);
			pageContext.getOut().print(theCaptionTitleHasDerivativeIterator.getHasDerivative());
		} catch (Exception e) {
			log.error("Can't find enclosing CaptionTitle for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaptionTitle for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

