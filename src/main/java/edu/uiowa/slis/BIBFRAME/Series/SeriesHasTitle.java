package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesHasTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesHasTitleIterator theSeriesHasTitleIterator = (SeriesHasTitleIterator)findAncestorWithClass(this, SeriesHasTitleIterator.class);
			pageContext.getOut().print(theSeriesHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

