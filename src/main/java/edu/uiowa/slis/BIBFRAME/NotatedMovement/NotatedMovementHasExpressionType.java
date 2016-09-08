package edu.uiowa.slis.BIBFRAME.NotatedMovement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMovementHasExpressionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMovementHasExpressionType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMovementHasExpressionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMovementHasExpressionIterator theNotatedMovementHasExpressionIterator = (NotatedMovementHasExpressionIterator)findAncestorWithClass(this, NotatedMovementHasExpressionIterator.class);
			pageContext.getOut().print(theNotatedMovementHasExpressionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMovement for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMovement for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

