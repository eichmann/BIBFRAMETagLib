package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesHasPreferredTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesHasPreferredTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesHasPreferredTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesHasPreferredTitleIterator theSeriesHasPreferredTitleIterator = (SeriesHasPreferredTitleIterator)findAncestorWithClass(this, SeriesHasPreferredTitleIterator.class);
			pageContext.getOut().print(theSeriesHasPreferredTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

