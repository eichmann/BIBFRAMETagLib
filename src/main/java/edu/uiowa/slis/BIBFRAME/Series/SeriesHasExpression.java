package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesHasExpression extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesHasExpression currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesHasExpression.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesHasExpressionIterator theSeriesHasExpressionIterator = (SeriesHasExpressionIterator)findAncestorWithClass(this, SeriesHasExpressionIterator.class);
			pageContext.getOut().print(theSeriesHasExpressionIterator.getHasExpression());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

