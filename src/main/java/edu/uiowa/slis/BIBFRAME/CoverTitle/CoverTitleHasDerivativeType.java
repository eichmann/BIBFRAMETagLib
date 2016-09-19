package edu.uiowa.slis.BIBFRAME.CoverTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoverTitleHasDerivativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CoverTitleHasDerivativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(CoverTitleHasDerivativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoverTitleHasDerivativeIterator theCoverTitleHasDerivativeIterator = (CoverTitleHasDerivativeIterator)findAncestorWithClass(this, CoverTitleHasDerivativeIterator.class);
			pageContext.getOut().print(theCoverTitleHasDerivativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CoverTitle for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoverTitle for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

