package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesIsExpressionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesIsExpressionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesIsExpressionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesIsExpressionOfIterator theSeriesIsExpressionOfIterator = (SeriesIsExpressionOfIterator)findAncestorWithClass(this, SeriesIsExpressionOfIterator.class);
			pageContext.getOut().print(theSeriesIsExpressionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}
