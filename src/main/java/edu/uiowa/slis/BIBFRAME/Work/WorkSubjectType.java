package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkSubjectType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkSubjectType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkSubjectType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkSubjectIterator theWorkSubjectIterator = (WorkSubjectIterator)findAncestorWithClass(this, WorkSubjectIterator.class);
			pageContext.getOut().print(theWorkSubjectIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for subject tag ");
		}
		return SKIP_BODY;
	}
}

