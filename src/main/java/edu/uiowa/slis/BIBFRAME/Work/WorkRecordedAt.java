package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkRecordedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkRecordedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkRecordedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkRecordedAtIterator theWorkRecordedAtIterator = (WorkRecordedAtIterator)findAncestorWithClass(this, WorkRecordedAtIterator.class);
			pageContext.getOut().print(theWorkRecordedAtIterator.getRecordedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

