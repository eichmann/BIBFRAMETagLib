package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesHasPreferredTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesHasPreferredTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesHasPreferredTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesHasPreferredTitleIterator theSeriesHasPreferredTitleIterator = (SeriesHasPreferredTitleIterator)findAncestorWithClass(this, SeriesHasPreferredTitleIterator.class);
			pageContext.getOut().print(theSeriesHasPreferredTitleIterator.getHasPreferredTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

