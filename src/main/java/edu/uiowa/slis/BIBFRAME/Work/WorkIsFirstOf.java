package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkIsFirstOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkIsFirstOf currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkIsFirstOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkIsFirstOfIterator theWorkIsFirstOfIterator = (WorkIsFirstOfIterator)findAncestorWithClass(this, WorkIsFirstOfIterator.class);
			pageContext.getOut().print(theWorkIsFirstOfIterator.getIsFirstOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for isFirstOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for isFirstOf tag ");
		}
		return SKIP_BODY;
	}
}

