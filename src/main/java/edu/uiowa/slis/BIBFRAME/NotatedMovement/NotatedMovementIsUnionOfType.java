package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementIsUnionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementIsUnionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementIsUnionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementIsUnionOfIterator theNotatedMovementIsUnionOfIterator = (NotatedMovementIsUnionOfIterator)findAncestorWithClass(this, NotatedMovementIsUnionOfIterator.class);
			pageContext.getOut().print(theNotatedMovementIsUnionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

