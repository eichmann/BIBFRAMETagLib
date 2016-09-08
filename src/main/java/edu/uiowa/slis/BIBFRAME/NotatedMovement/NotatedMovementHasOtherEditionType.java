package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementHasOtherEditionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementHasOtherEditionType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementHasOtherEditionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementHasOtherEditionIterator theNotatedMovementHasOtherEditionIterator = (NotatedMovementHasOtherEditionIterator)findAncestorWithClass(this, NotatedMovementHasOtherEditionIterator.class);
			pageContext.getOut().print(theNotatedMovementHasOtherEditionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

