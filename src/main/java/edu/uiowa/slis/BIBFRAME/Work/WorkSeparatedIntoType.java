package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkSeparatedIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkSeparatedIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkSeparatedIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkSeparatedIntoIterator theWorkSeparatedIntoIterator = (WorkSeparatedIntoIterator)findAncestorWithClass(this, WorkSeparatedIntoIterator.class);
			pageContext.getOut().print(theWorkSeparatedIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

