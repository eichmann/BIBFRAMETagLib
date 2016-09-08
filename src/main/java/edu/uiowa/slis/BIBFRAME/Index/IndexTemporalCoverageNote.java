package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexTemporalCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexTemporalCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexTemporalCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndexTemporalCoverageNoteIterator theIndex = (IndexTemporalCoverageNoteIterator)findAncestorWithClass(this, IndexTemporalCoverageNoteIterator.class);
			pageContext.getOut().print(theIndex.getTemporalCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for temporalCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for temporalCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

