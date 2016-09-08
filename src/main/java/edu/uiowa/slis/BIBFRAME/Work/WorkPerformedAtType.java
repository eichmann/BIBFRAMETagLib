package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkPerformedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkPerformedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkPerformedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkPerformedAtIterator theWorkPerformedAtIterator = (WorkPerformedAtIterator)findAncestorWithClass(this, WorkPerformedAtIterator.class);
			pageContext.getOut().print(theWorkPerformedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

