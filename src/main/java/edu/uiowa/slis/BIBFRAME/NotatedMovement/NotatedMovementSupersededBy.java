package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementSupersededBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementSupersededBy currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementSupersededBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementSupersededByIterator theNotatedMovementSupersededByIterator = (NotatedMovementSupersededByIterator)findAncestorWithClass(this, NotatedMovementSupersededByIterator.class);
			pageContext.getOut().print(theNotatedMovementSupersededByIterator.getSupersededBy());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

