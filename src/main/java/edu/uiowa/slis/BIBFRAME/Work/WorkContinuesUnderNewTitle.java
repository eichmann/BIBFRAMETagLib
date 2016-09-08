package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkContinuesUnderNewTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkContinuesUnderNewTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkContinuesUnderNewTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkContinuesUnderNewTitleIterator theWorkContinuesUnderNewTitleIterator = (WorkContinuesUnderNewTitleIterator)findAncestorWithClass(this, WorkContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theWorkContinuesUnderNewTitleIterator.getContinuesUnderNewTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

