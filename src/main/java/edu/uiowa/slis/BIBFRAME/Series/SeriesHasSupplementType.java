package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesHasSupplementType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesHasSupplementType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesHasSupplementType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesHasSupplementIterator theSeriesHasSupplementIterator = (SeriesHasSupplementIterator)findAncestorWithClass(this, SeriesHasSupplementIterator.class);
			pageContext.getOut().print(theSeriesHasSupplementIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

