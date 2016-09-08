package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkSupersededBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkSupersededBy currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkSupersededBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkSupersededByIterator theWorkSupersededByIterator = (WorkSupersededByIterator)findAncestorWithClass(this, WorkSupersededByIterator.class);
			pageContext.getOut().print(theWorkSupersededByIterator.getSupersededBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

