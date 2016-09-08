package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkSupersedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkSupersedes currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkSupersedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkSupersedesIterator theWorkSupersedesIterator = (WorkSupersedesIterator)findAncestorWithClass(this, WorkSupersedesIterator.class);
			pageContext.getOut().print(theWorkSupersedesIterator.getSupersedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

