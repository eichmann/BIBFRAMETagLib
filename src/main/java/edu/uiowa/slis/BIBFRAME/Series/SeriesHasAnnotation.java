package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesHasAnnotation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesHasAnnotation currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesHasAnnotation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesHasAnnotationIterator theSeriesHasAnnotationIterator = (SeriesHasAnnotationIterator)findAncestorWithClass(this, SeriesHasAnnotationIterator.class);
			pageContext.getOut().print(theSeriesHasAnnotationIterator.getHasAnnotation());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for hasAnnotation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for hasAnnotation tag ");
		}
		return SKIP_BODY;
	}
}

