package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesAccompanies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesAccompanies currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesAccompanies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesAccompaniesIterator theSeriesAccompaniesIterator = (SeriesAccompaniesIterator)findAncestorWithClass(this, SeriesAccompaniesIterator.class);
			pageContext.getOut().print(theSeriesAccompaniesIterator.getAccompanies());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

