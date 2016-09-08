package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesLanguage extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesLanguage currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesLanguage.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesLanguageIterator theSeriesLanguageIterator = (SeriesLanguageIterator)findAncestorWithClass(this, SeriesLanguageIterator.class);
			pageContext.getOut().print(theSeriesLanguageIterator.getLanguage());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for language tag ");
		}
		return SKIP_BODY;
	}
}

