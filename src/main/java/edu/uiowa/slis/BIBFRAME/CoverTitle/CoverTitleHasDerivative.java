package edu.uiowa.slis.BIBFRAME.CoverTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoverTitleHasDerivative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CoverTitleHasDerivative currentInstance = null;
	private static final Log log = LogFactory.getLog(CoverTitleHasDerivative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoverTitleHasDerivativeIterator theCoverTitleHasDerivativeIterator = (CoverTitleHasDerivativeIterator)findAncestorWithClass(this, CoverTitleHasDerivativeIterator.class);
			pageContext.getOut().print(theCoverTitleHasDerivativeIterator.getHasDerivative());
		} catch (Exception e) {
			log.error("Can't find enclosing CoverTitle for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoverTitle for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

