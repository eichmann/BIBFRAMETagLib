package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkHasPartIterator theWorkHasPartIterator = (WorkHasPartIterator)findAncestorWithClass(this, WorkHasPartIterator.class);
			pageContext.getOut().print(theWorkHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

