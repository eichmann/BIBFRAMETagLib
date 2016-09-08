package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkSeparatedInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkSeparatedInto currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkSeparatedInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkSeparatedIntoIterator theWorkSeparatedIntoIterator = (WorkSeparatedIntoIterator)findAncestorWithClass(this, WorkSeparatedIntoIterator.class);
			pageContext.getOut().print(theWorkSeparatedIntoIterator.getSeparatedInto());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for separatedInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for separatedInto tag ");
		}
		return SKIP_BODY;
	}
}

