package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkFollowsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkFollowsType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkFollowsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkFollowsIterator theWorkFollowsIterator = (WorkFollowsIterator)findAncestorWithClass(this, WorkFollowsIterator.class);
			pageContext.getOut().print(theWorkFollowsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for follows tag ");
		}
		return SKIP_BODY;
	}
}

