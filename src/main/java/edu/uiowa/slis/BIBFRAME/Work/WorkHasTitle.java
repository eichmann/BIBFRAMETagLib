package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkHasTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkHasTitleIterator theWorkHasTitleIterator = (WorkHasTitleIterator)findAncestorWithClass(this, WorkHasTitleIterator.class);
			pageContext.getOut().print(theWorkHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

