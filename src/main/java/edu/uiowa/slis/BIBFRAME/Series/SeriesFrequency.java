package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesFrequency extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesFrequency currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesFrequency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SeriesFrequencyIterator theSeries = (SeriesFrequencyIterator)findAncestorWithClass(this, SeriesFrequencyIterator.class);
			pageContext.getOut().print(theSeries.getFrequency());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for frequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for frequency tag ");
		}
		return SKIP_BODY;
	}
}

