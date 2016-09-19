package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkIsSubjectOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkIsSubjectOf currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkIsSubjectOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkIsSubjectOfIterator theWorkIsSubjectOfIterator = (WorkIsSubjectOfIterator)findAncestorWithClass(this, WorkIsSubjectOfIterator.class);
			pageContext.getOut().print(theWorkIsSubjectOfIterator.getIsSubjectOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

