package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkContinuedUnderNewTitleBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkContinuedUnderNewTitleBy currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkContinuedUnderNewTitleBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkContinuedUnderNewTitleByIterator theWorkContinuedUnderNewTitleByIterator = (WorkContinuedUnderNewTitleByIterator)findAncestorWithClass(this, WorkContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theWorkContinuedUnderNewTitleByIterator.getContinuedUnderNewTitleBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

