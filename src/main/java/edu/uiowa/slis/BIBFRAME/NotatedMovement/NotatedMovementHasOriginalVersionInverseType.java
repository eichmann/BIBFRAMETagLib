package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementHasOriginalVersionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementHasOriginalVersionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementHasOriginalVersionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementHasOriginalVersionInverseIterator theNotatedMovementHasOriginalVersionInverseIterator = (NotatedMovementHasOriginalVersionInverseIterator)findAncestorWithClass(this, NotatedMovementHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theNotatedMovementHasOriginalVersionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

