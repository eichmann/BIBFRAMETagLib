package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementHasDerivative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementHasDerivative currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementHasDerivative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementHasDerivativeIterator theNotatedMovementHasDerivativeIterator = (NotatedMovementHasDerivativeIterator)findAncestorWithClass(this, NotatedMovementHasDerivativeIterator.class);
			pageContext.getOut().print(theNotatedMovementHasDerivativeIterator.getHasDerivative());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

