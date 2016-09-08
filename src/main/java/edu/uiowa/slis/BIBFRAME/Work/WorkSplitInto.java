package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkSplitInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkSplitInto currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkSplitInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkSplitIntoIterator theWorkSplitIntoIterator = (WorkSplitIntoIterator)findAncestorWithClass(this, WorkSplitIntoIterator.class);
			pageContext.getOut().print(theWorkSplitIntoIterator.getSplitInto());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

