package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographIsExpressionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographIsExpressionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographIsExpressionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographIsExpressionOfIterator theMonographIsExpressionOfIterator = (MonographIsExpressionOfIterator)findAncestorWithClass(this, MonographIsExpressionOfIterator.class);
			pageContext.getOut().print(theMonographIsExpressionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

