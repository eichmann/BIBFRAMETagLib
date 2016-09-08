package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesRecordedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesRecordedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesRecordedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesRecordedAtIterator theSeriesRecordedAtIterator = (SeriesRecordedAtIterator)findAncestorWithClass(this, SeriesRecordedAtIterator.class);
			pageContext.getOut().print(theSeriesRecordedAtIterator.getRecordedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

