package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementHasInstance extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementHasInstance currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementHasInstance.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementHasInstanceIterator theNotatedMovementHasInstanceIterator = (NotatedMovementHasInstanceIterator)findAncestorWithClass(this, NotatedMovementHasInstanceIterator.class);
			pageContext.getOut().print(theNotatedMovementHasInstanceIterator.getHasInstance());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

