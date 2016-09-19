package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkHasOriginalVersionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkHasOriginalVersionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkHasOriginalVersionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkHasOriginalVersionInverseIterator theWorkHasOriginalVersionInverseIterator = (WorkHasOriginalVersionInverseIterator)findAncestorWithClass(this, WorkHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theWorkHasOriginalVersionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

