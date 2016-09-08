package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesSubjectType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesSubjectType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesSubjectType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesSubjectIterator theSeriesSubjectIterator = (SeriesSubjectIterator)findAncestorWithClass(this, SeriesSubjectIterator.class);
			pageContext.getOut().print(theSeriesSubjectIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for subject tag ");
		}
		return SKIP_BODY;
	}
}

