package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesLanguageType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesLanguageType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesLanguageType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesLanguageIterator theSeriesLanguageIterator = (SeriesLanguageIterator)findAncestorWithClass(this, SeriesLanguageIterator.class);
			pageContext.getOut().print(theSeriesLanguageIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for language tag ");
		}
		return SKIP_BODY;
	}
}

