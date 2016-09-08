package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkTemporalCoverageNote extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkTemporalCoverageNote currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkTemporalCoverageNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkTemporalCoverageNoteIterator theWork = (WorkTemporalCoverageNoteIterator)findAncestorWithClass(this, WorkTemporalCoverageNoteIterator.class);
			pageContext.getOut().print(theWork.getTemporalCoverageNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for temporalCoverageNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for temporalCoverageNote tag ");
		}
		return SKIP_BODY;
	}
}

