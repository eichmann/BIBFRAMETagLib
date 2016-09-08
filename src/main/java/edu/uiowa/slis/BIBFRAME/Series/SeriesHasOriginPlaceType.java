package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesHasOriginPlaceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesHasOriginPlaceType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesHasOriginPlaceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesHasOriginPlaceIterator theSeriesHasOriginPlaceIterator = (SeriesHasOriginPlaceIterator)findAncestorWithClass(this, SeriesHasOriginPlaceIterator.class);
			pageContext.getOut().print(theSeriesHasOriginPlaceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

