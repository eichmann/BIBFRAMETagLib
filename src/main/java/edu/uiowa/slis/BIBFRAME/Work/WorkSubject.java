package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkSubject extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkSubject currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkSubject.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkSubjectIterator theWorkSubjectIterator = (WorkSubjectIterator)findAncestorWithClass(this, WorkSubjectIterator.class);
			pageContext.getOut().print(theWorkSubjectIterator.getSubject());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for subject tag ");
		}
		return SKIP_BODY;
	}
}

