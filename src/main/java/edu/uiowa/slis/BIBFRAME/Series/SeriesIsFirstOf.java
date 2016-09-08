package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesIsFirstOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesIsFirstOf currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesIsFirstOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesIsFirstOfIterator theSeriesIsFirstOfIterator = (SeriesIsFirstOfIterator)findAncestorWithClass(this, SeriesIsFirstOfIterator.class);
			pageContext.getOut().print(theSeriesIsFirstOfIterator.getIsFirstOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

