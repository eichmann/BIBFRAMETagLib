package edu.uiowa.slis.BIBFRAME.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetGeographicCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatasetGeographicCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetGeographicCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetGeographicCoverageNoteIterator theDataset = (DatasetGeographicCoverageNoteIterator)findAncestorWithClass(this, DatasetGeographicCoverageNoteIterator.class);
			pageContext.getOut().print(theDataset.getGeographicCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for geographicCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for geographicCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

