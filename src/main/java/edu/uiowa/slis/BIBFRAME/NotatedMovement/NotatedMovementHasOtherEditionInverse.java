package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementHasOtherEditionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementHasOtherEditionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementHasOtherEditionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementHasOtherEditionInverseIterator theNotatedMovementHasOtherEditionInverseIterator = (NotatedMovementHasOtherEditionInverseIterator)findAncestorWithClass(this, NotatedMovementHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theNotatedMovementHasOtherEditionInverseIterator.getHasOtherEditionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

