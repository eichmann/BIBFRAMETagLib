package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesIsPartOfIterator theSeriesIsPartOfIterator = (SeriesIsPartOfIterator)findAncestorWithClass(this, SeriesIsPartOfIterator.class);
			pageContext.getOut().print(theSeriesIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

