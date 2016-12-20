package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkAccompaniedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkAccompaniedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkAccompaniedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkAccompaniedByIterator theWorkAccompaniedByIterator = (WorkAccompaniedByIterator)findAncestorWithClass(this, WorkAccompaniedByIterator.class);
			pageContext.getOut().print(theWorkAccompaniedByIterator.getAccompaniedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}

