package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkAccompaniesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkAccompaniesType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkAccompaniesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkAccompaniesIterator theWorkAccompaniesIterator = (WorkAccompaniesIterator)findAncestorWithClass(this, WorkAccompaniesIterator.class);
			pageContext.getOut().print(theWorkAccompaniesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

