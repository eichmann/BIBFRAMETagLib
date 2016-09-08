package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesHasFirstType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesHasFirstType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesHasFirstType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesHasFirstIterator theSeriesHasFirstIterator = (SeriesHasFirstIterator)findAncestorWithClass(this, SeriesHasFirstIterator.class);
			pageContext.getOut().print(theSeriesHasFirstIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for hasFirst tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for hasFirst tag ");
		}
		return SKIP_BODY;
	}
}

