package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexIsExpressionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexIsExpressionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexIsExpressionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexIsExpressionOfIterator theIndexIsExpressionOfIterator = (IndexIsExpressionOfIterator)findAncestorWithClass(this, IndexIsExpressionOfIterator.class);
			pageContext.getOut().print(theIndexIsExpressionOfIterator.getIsExpressionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

