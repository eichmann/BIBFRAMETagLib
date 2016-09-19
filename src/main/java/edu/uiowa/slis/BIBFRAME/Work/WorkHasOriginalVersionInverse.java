package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkHasOriginalVersionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkHasOriginalVersionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkHasOriginalVersionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkHasOriginalVersionInverseIterator theWorkHasOriginalVersionInverseIterator = (WorkHasOriginalVersionInverseIterator)findAncestorWithClass(this, WorkHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theWorkHasOriginalVersionInverseIterator.getHasOriginalVersionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

