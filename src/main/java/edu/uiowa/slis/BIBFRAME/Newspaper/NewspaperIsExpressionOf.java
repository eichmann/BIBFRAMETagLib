package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperIsExpressionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperIsExpressionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperIsExpressionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperIsExpressionOfIterator theNewspaperIsExpressionOfIterator = (NewspaperIsExpressionOfIterator)findAncestorWithClass(this, NewspaperIsExpressionOfIterator.class);
			pageContext.getOut().print(theNewspaperIsExpressionOfIterator.getIsExpressionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

