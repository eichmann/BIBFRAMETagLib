package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkHasInstanceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkHasInstanceType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkHasInstanceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkHasInstanceIterator theWorkHasInstanceIterator = (WorkHasInstanceIterator)findAncestorWithClass(this, WorkHasInstanceIterator.class);
			pageContext.getOut().print(theWorkHasInstanceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

