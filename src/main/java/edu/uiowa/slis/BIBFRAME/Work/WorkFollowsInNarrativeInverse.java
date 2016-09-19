package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkFollowsInNarrativeInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkFollowsInNarrativeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkFollowsInNarrativeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkFollowsInNarrativeInverseIterator theWorkFollowsInNarrativeInverseIterator = (WorkFollowsInNarrativeInverseIterator)findAncestorWithClass(this, WorkFollowsInNarrativeInverseIterator.class);
			pageContext.getOut().print(theWorkFollowsInNarrativeInverseIterator.getFollowsInNarrativeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for followsInNarrative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for followsInNarrative tag ");
		}
		return SKIP_BODY;
	}
}

