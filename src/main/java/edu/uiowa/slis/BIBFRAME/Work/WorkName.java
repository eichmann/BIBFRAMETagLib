package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkName extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkName currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkNameIterator theWork = (WorkNameIterator)findAncestorWithClass(this, WorkNameIterator.class);
			pageContext.getOut().print(theWork.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for name tag ");
		}
		return SKIP_BODY;
	}
}

