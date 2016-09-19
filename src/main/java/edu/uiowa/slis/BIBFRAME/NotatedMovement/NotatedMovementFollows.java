package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementFollows extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementFollows currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementFollows.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementFollowsIterator theNotatedMovementFollowsIterator = (NotatedMovementFollowsIterator)findAncestorWithClass(this, NotatedMovementFollowsIterator.class);
			pageContext.getOut().print(theNotatedMovementFollowsIterator.getFollows());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for follows tag ");
		}
		return SKIP_BODY;
	}
}

