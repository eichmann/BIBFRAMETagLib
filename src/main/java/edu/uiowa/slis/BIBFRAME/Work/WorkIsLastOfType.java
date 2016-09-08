package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkIsLastOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkIsLastOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkIsLastOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkIsLastOfIterator theWorkIsLastOfIterator = (WorkIsLastOfIterator)findAncestorWithClass(this, WorkIsLastOfIterator.class);
			pageContext.getOut().print(theWorkIsLastOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

