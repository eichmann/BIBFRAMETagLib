package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesHasLast extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesHasLast currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesHasLast.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesHasLastIterator theSeriesHasLastIterator = (SeriesHasLastIterator)findAncestorWithClass(this, SeriesHasLastIterator.class);
			pageContext.getOut().print(theSeriesHasLastIterator.getHasLast());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for hasLast tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for hasLast tag ");
		}
		return SKIP_BODY;
	}
}

