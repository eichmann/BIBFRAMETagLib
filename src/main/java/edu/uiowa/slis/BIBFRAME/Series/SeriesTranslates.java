package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesTranslates extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesTranslates currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesTranslates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesTranslatesIterator theSeriesTranslatesIterator = (SeriesTranslatesIterator)findAncestorWithClass(this, SeriesTranslatesIterator.class);
			pageContext.getOut().print(theSeriesTranslatesIterator.getTranslates());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for translates tag ");
		}
		return SKIP_BODY;
	}
}

