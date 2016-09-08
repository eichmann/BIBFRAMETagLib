package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesTranslatedAsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesTranslatedAsType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesTranslatedAsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesTranslatedAsIterator theSeriesTranslatedAsIterator = (SeriesTranslatedAsIterator)findAncestorWithClass(this, SeriesTranslatedAsIterator.class);
			pageContext.getOut().print(theSeriesTranslatedAsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

