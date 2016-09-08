package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkTranslates extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkTranslates currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkTranslates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkTranslatesIterator theWorkTranslatesIterator = (WorkTranslatesIterator)findAncestorWithClass(this, WorkTranslatesIterator.class);
			pageContext.getOut().print(theWorkTranslatesIterator.getTranslates());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for translates tag ");
		}
		return SKIP_BODY;
	}
}

