package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexIsExpressionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexIsExpressionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexIsExpressionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexIsExpressionOfIterator theIndexIsExpressionOfIterator = (IndexIsExpressionOfIterator)findAncestorWithClass(this, IndexIsExpressionOfIterator.class);
			pageContext.getOut().print(theIndexIsExpressionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

