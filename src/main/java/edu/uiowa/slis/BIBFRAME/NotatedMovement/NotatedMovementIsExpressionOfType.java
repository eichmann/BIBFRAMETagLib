package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementIsExpressionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementIsExpressionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementIsExpressionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementIsExpressionOfIterator theNotatedMovementIsExpressionOfIterator = (NotatedMovementIsExpressionOfIterator)findAncestorWithClass(this, NotatedMovementIsExpressionOfIterator.class);
			pageContext.getOut().print(theNotatedMovementIsExpressionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}
