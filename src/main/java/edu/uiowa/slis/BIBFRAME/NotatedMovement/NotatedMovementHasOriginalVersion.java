package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementHasOriginalVersion extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementHasOriginalVersion currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementHasOriginalVersion.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementHasOriginalVersionIterator theNotatedMovementHasOriginalVersionIterator = (NotatedMovementHasOriginalVersionIterator)findAncestorWithClass(this, NotatedMovementHasOriginalVersionIterator.class);
			pageContext.getOut().print(theNotatedMovementHasOriginalVersionIterator.getHasOriginalVersion());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

