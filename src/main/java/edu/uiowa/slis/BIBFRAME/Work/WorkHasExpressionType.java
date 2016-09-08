package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkHasExpressionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkHasExpressionType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkHasExpressionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkHasExpressionIterator theWorkHasExpressionIterator = (WorkHasExpressionIterator)findAncestorWithClass(this, WorkHasExpressionIterator.class);
			pageContext.getOut().print(theWorkHasExpressionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

