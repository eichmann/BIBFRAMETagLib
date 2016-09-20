package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographIsExpressionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographIsExpressionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographIsExpressionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographIsExpressionOfIterator theMonographIsExpressionOfIterator = (MonographIsExpressionOfIterator)findAncestorWithClass(this, MonographIsExpressionOfIterator.class);
			pageContext.getOut().print(theMonographIsExpressionOfIterator.getIsExpressionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

