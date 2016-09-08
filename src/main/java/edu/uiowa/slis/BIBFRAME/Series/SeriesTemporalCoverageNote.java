package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesTemporalCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesTemporalCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesTemporalCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SeriesTemporalCoverageNoteIterator theSeries = (SeriesTemporalCoverageNoteIterator)findAncestorWithClass(this, SeriesTemporalCoverageNoteIterator.class);
			pageContext.getOut().print(theSeries.getTemporalCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for temporalCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for temporalCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

