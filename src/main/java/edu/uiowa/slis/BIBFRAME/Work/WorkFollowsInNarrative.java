package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkFollowsInNarrative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkFollowsInNarrative currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkFollowsInNarrative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkFollowsInNarrativeIterator theWorkFollowsInNarrativeIterator = (WorkFollowsInNarrativeIterator)findAncestorWithClass(this, WorkFollowsInNarrativeIterator.class);
			pageContext.getOut().print(theWorkFollowsInNarrativeIterator.getFollowsInNarrative());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

