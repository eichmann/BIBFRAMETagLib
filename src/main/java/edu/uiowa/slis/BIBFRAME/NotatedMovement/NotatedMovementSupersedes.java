package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementSupersedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementSupersedes currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementSupersedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementSupersedesIterator theNotatedMovementSupersedesIterator = (NotatedMovementSupersedesIterator)findAncestorWithClass(this, NotatedMovementSupersedesIterator.class);
			pageContext.getOut().print(theNotatedMovementSupersedesIterator.getSupersedes());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

