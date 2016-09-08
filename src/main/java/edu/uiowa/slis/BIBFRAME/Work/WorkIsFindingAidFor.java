package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkIsFindingAidFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkIsFindingAidFor currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkIsFindingAidFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkIsFindingAidForIterator theWorkIsFindingAidForIterator = (WorkIsFindingAidForIterator)findAncestorWithClass(this, WorkIsFindingAidForIterator.class);
			pageContext.getOut().print(theWorkIsFindingAidForIterator.getIsFindingAidFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

