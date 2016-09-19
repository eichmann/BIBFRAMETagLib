package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkHasDataSourceInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkHasDataSourceInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkHasDataSourceInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkHasDataSourceInverseIterator theWorkHasDataSourceInverseIterator = (WorkHasDataSourceInverseIterator)findAncestorWithClass(this, WorkHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theWorkHasDataSourceInverseIterator.getHasDataSourceInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

