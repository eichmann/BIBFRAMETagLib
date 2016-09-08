package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesIsFirstOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesIsFirstOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesIsFirstOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesIsFirstOfIterator theSeriesIsFirstOfIterator = (SeriesIsFirstOfIterator)findAncestorWithClass(this, SeriesIsFirstOfIterator.class);
			pageContext.getOut().print(theSeriesIsFirstOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

