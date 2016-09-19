package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkFollows extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkFollows currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkFollows.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkFollowsIterator theWorkFollowsIterator = (WorkFollowsIterator)findAncestorWithClass(this, WorkFollowsIterator.class);
			pageContext.getOut().print(theWorkFollowsIterator.getFollows());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for follows tag ");
		}
		return SKIP_BODY;
	}
}

