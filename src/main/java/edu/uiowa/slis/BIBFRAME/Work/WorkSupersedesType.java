package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkSupersedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkSupersedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkSupersedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkSupersedesIterator theWorkSupersedesIterator = (WorkSupersedesIterator)findAncestorWithClass(this, WorkSupersedesIterator.class);
			pageContext.getOut().print(theWorkSupersedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

