package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesIsSubjectOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesIsSubjectOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesIsSubjectOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesIsSubjectOfIterator theSeriesIsSubjectOfIterator = (SeriesIsSubjectOfIterator)findAncestorWithClass(this, SeriesIsSubjectOfIterator.class);
			pageContext.getOut().print(theSeriesIsSubjectOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

