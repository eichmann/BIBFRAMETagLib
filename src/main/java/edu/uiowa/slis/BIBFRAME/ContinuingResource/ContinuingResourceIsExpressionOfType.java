package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceIsExpressionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceIsExpressionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceIsExpressionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceIsExpressionOfIterator theContinuingResourceIsExpressionOfIterator = (ContinuingResourceIsExpressionOfIterator)findAncestorWithClass(this, ContinuingResourceIsExpressionOfIterator.class);
			pageContext.getOut().print(theContinuingResourceIsExpressionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

