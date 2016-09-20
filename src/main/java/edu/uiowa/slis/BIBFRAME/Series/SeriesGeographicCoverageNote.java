package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesGeographicCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesGeographicCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesGeographicCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SeriesGeographicCoverageNoteIterator theSeries = (SeriesGeographicCoverageNoteIterator)findAncestorWithClass(this, SeriesGeographicCoverageNoteIterator.class);
			pageContext.getOut().print(theSeries.getGeographicCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for geographicCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for geographicCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

