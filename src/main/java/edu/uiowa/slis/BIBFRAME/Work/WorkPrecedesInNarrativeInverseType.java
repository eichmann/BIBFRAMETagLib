package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkPrecedesInNarrativeInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkPrecedesInNarrativeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkPrecedesInNarrativeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkPrecedesInNarrativeInverseIterator theWorkPrecedesInNarrativeInverseIterator = (WorkPrecedesInNarrativeInverseIterator)findAncestorWithClass(this, WorkPrecedesInNarrativeInverseIterator.class);
			pageContext.getOut().print(theWorkPrecedesInNarrativeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for precedesInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for precedesInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

