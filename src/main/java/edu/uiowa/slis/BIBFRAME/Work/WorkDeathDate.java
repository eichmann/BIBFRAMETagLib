package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkDeathDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkDeathDate currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkDeathDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkDeathDateIterator theWork = (WorkDeathDateIterator)findAncestorWithClass(this, WorkDeathDateIterator.class);
			pageContext.getOut().print(theWork.getDeathDate());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for deathDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for deathDate tag ");
		}
		return SKIP_BODY;
	}
}

