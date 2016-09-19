package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementHasOtherEditionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementHasOtherEditionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementHasOtherEditionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementHasOtherEditionInverseIterator theNotatedMovementHasOtherEditionInverseIterator = (NotatedMovementHasOtherEditionInverseIterator)findAncestorWithClass(this, NotatedMovementHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theNotatedMovementHasOtherEditionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

