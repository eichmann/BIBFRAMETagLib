package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesHasOriginalVersionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesHasOriginalVersionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesHasOriginalVersionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesHasOriginalVersionInverseIterator theSeriesHasOriginalVersionInverseIterator = (SeriesHasOriginalVersionInverseIterator)findAncestorWithClass(this, SeriesHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theSeriesHasOriginalVersionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

