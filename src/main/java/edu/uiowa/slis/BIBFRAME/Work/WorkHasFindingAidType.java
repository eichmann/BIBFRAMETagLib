package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkHasFindingAidType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkHasFindingAidType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkHasFindingAidType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkHasFindingAidIterator theWorkHasFindingAidIterator = (WorkHasFindingAidIterator)findAncestorWithClass(this, WorkHasFindingAidIterator.class);
			pageContext.getOut().print(theWorkHasFindingAidIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}

