package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesHasDataSourceInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesHasDataSourceInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesHasDataSourceInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesHasDataSourceInverseIterator theSeriesHasDataSourceInverseIterator = (SeriesHasDataSourceInverseIterator)findAncestorWithClass(this, SeriesHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theSeriesHasDataSourceInverseIterator.getHasDataSourceInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

