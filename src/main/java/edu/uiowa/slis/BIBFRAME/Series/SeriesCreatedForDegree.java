package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesCreatedForDegree extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesCreatedForDegree currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesCreatedForDegree.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesCreatedForDegreeIterator theSeriesCreatedForDegreeIterator = (SeriesCreatedForDegreeIterator)findAncestorWithClass(this, SeriesCreatedForDegreeIterator.class);
			pageContext.getOut().print(theSeriesCreatedForDegreeIterator.getCreatedForDegree());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}

