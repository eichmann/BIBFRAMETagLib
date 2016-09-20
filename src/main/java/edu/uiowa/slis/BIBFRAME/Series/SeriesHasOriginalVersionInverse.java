package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesHasOriginalVersionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesHasOriginalVersionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesHasOriginalVersionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesHasOriginalVersionInverseIterator theSeriesHasOriginalVersionInverseIterator = (SeriesHasOriginalVersionInverseIterator)findAncestorWithClass(this, SeriesHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theSeriesHasOriginalVersionInverseIterator.getHasOriginalVersionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

