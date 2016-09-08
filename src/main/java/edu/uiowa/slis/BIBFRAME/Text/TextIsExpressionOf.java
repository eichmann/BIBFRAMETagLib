package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextIsExpressionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextIsExpressionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(TextIsExpressionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextIsExpressionOfIterator theTextIsExpressionOfIterator = (TextIsExpressionOfIterator)findAncestorWithClass(this, TextIsExpressionOfIterator.class);
			pageContext.getOut().print(theTextIsExpressionOfIterator.getIsExpressionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

