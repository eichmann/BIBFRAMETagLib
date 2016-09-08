package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkIsExpressionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkIsExpressionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkIsExpressionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkIsExpressionOfIterator theWorkIsExpressionOfIterator = (WorkIsExpressionOfIterator)findAncestorWithClass(this, WorkIsExpressionOfIterator.class);
			pageContext.getOut().print(theWorkIsExpressionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

