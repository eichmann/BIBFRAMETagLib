package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkFollowsInNarrativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkFollowsInNarrativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkFollowsInNarrativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkFollowsInNarrativeIterator theWorkFollowsInNarrativeIterator = (WorkFollowsInNarrativeIterator)findAncestorWithClass(this, WorkFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theWorkFollowsInNarrativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

