package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesHasDataSource extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesHasDataSource currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesHasDataSource.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesHasDataSourceIterator theSeriesHasDataSourceIterator = (SeriesHasDataSourceIterator)findAncestorWithClass(this, SeriesHasDataSourceIterator.class);
			pageContext.getOut().print(theSeriesHasDataSourceIterator.getHasDataSource());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

