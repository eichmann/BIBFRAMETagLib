package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkHasDerivativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkHasDerivativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkHasDerivativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkHasDerivativeIterator theWorkHasDerivativeIterator = (WorkHasDerivativeIterator)findAncestorWithClass(this, WorkHasDerivativeIterator.class);
			pageContext.getOut().print(theWorkHasDerivativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

