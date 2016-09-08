package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementHasExpression extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementHasExpression currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementHasExpression.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementHasExpressionIterator theNotatedMovementHasExpressionIterator = (NotatedMovementHasExpressionIterator)findAncestorWithClass(this, NotatedMovementHasExpressionIterator.class);
			pageContext.getOut().print(theNotatedMovementHasExpressionIterator.getHasExpression());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

