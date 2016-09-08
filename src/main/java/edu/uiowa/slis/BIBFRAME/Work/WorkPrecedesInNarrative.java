package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkPrecedesInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkPrecedesInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkPrecedesInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkPrecedesInNarrativeIterator theWorkPrecedesInNarrativeIterator = (WorkPrecedesInNarrativeIterator)findAncestorWithClass(this, WorkPrecedesInNarrativeIterator.class);
			pageContext.getOut().print(theWorkPrecedesInNarrativeIterator.getPrecedesInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

