package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkHasDataSource extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkHasDataSource currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkHasDataSource.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkHasDataSourceIterator theWorkHasDataSourceIterator = (WorkHasDataSourceIterator)findAncestorWithClass(this, WorkHasDataSourceIterator.class);
			pageContext.getOut().print(theWorkHasDataSourceIterator.getHasDataSource());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

