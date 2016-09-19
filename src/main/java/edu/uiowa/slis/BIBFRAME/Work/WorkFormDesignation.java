package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkFormDesignationIterator theWork = (WorkFormDesignationIterator)findAncestorWithClass(this, WorkFormDesignationIterator.class);
			pageContext.getOut().print(theWork.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

