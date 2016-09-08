package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexGeographicCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexGeographicCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexGeographicCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndexGeographicCoverageNoteIterator theIndex = (IndexGeographicCoverageNoteIterator)findAncestorWithClass(this, IndexGeographicCoverageNoteIterator.class);
			pageContext.getOut().print(theIndex.getGeographicCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for geographicCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for geographicCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

