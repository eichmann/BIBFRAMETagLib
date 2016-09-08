package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementIsUnionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementIsUnionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementIsUnionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementIsUnionOfIterator theNotatedMovementIsUnionOfIterator = (NotatedMovementIsUnionOfIterator)findAncestorWithClass(this, NotatedMovementIsUnionOfIterator.class);
			pageContext.getOut().print(theNotatedMovementIsUnionOfIterator.getIsUnionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

