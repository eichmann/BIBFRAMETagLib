package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkHasPartIterator theWorkHasPartIterator = (WorkHasPartIterator)findAncestorWithClass(this, WorkHasPartIterator.class);
			pageContext.getOut().print(theWorkHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

