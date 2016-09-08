package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceIsExpressionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceIsExpressionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceIsExpressionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceIsExpressionOfIterator theContinuingResourceIsExpressionOfIterator = (ContinuingResourceIsExpressionOfIterator)findAncestorWithClass(this, ContinuingResourceIsExpressionOfIterator.class);
			pageContext.getOut().print(theContinuingResourceIsExpressionOfIterator.getIsExpressionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

