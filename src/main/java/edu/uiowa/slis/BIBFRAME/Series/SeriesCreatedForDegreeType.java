package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesCreatedForDegreeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesCreatedForDegreeType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesCreatedForDegreeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesCreatedForDegreeIterator theSeriesCreatedForDegreeIterator = (SeriesCreatedForDegreeIterator)findAncestorWithClass(this, SeriesCreatedForDegreeIterator.class);
			pageContext.getOut().print(theSeriesCreatedForDegreeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}

