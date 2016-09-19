package edu.uiowa.slis.BIBFRAME.CaptionTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaptionTitleHasDerivativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CaptionTitleHasDerivativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(CaptionTitleHasDerivativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CaptionTitleHasDerivativeIterator theCaptionTitleHasDerivativeIterator = (CaptionTitleHasDerivativeIterator)findAncestorWithClass(this, CaptionTitleHasDerivativeIterator.class);
			pageContext.getOut().print(theCaptionTitleHasDerivativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CaptionTitle for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaptionTitle for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

