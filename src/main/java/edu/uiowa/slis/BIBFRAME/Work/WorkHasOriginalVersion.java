package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkHasOriginalVersion extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkHasOriginalVersion currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkHasOriginalVersion.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkHasOriginalVersionIterator theWorkHasOriginalVersionIterator = (WorkHasOriginalVersionIterator)findAncestorWithClass(this, WorkHasOriginalVersionIterator.class);
			pageContext.getOut().print(theWorkHasOriginalVersionIterator.getHasOriginalVersion());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

