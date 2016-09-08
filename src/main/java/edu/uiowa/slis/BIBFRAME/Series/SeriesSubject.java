package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesSubject extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesSubject currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesSubject.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesSubjectIterator theSeriesSubjectIterator = (SeriesSubjectIterator)findAncestorWithClass(this, SeriesSubjectIterator.class);
			pageContext.getOut().print(theSeriesSubjectIterator.getSubject());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for subject tag ");
		}
		return SKIP_BODY;
	}
}

