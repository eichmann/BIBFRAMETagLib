package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkHasSupplementType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkHasSupplementType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkHasSupplementType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkHasSupplementIterator theWorkHasSupplementIterator = (WorkHasSupplementIterator)findAncestorWithClass(this, WorkHasSupplementIterator.class);
			pageContext.getOut().print(theWorkHasSupplementIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

