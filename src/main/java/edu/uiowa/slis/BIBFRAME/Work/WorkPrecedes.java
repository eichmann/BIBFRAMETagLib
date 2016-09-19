package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkPrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkPrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkPrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkPrecedesIterator theWorkPrecedesIterator = (WorkPrecedesIterator)findAncestorWithClass(this, WorkPrecedesIterator.class);
			pageContext.getOut().print(theWorkPrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for precedes tag ");
		}
		return SKIP_BODY;
	}
}

