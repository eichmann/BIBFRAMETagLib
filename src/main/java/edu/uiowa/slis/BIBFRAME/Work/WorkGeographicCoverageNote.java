package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkGeographicCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkGeographicCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkGeographicCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkGeographicCoverageNoteIterator theWork = (WorkGeographicCoverageNoteIterator)findAncestorWithClass(this, WorkGeographicCoverageNoteIterator.class);
			pageContext.getOut().print(theWork.getGeographicCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for geographicCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for geographicCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

