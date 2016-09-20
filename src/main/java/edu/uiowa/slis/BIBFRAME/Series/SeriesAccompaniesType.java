package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesAccompaniesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesAccompaniesType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesAccompaniesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesAccompaniesIterator theSeriesAccompaniesIterator = (SeriesAccompaniesIterator)findAncestorWithClass(this, SeriesAccompaniesIterator.class);
			pageContext.getOut().print(theSeriesAccompaniesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

