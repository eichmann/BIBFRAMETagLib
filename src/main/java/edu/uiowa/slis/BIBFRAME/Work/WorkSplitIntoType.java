package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkSplitIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkSplitIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkSplitIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkSplitIntoIterator theWorkSplitIntoIterator = (WorkSplitIntoIterator)findAncestorWithClass(this, WorkSplitIntoIterator.class);
			pageContext.getOut().print(theWorkSplitIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

