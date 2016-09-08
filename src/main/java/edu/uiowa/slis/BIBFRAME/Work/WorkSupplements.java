package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkSupplements extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkSupplements currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkSupplements.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkSupplementsIterator theWorkSupplementsIterator = (WorkSupplementsIterator)findAncestorWithClass(this, WorkSupplementsIterator.class);
			pageContext.getOut().print(theWorkSupplementsIterator.getSupplements());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for supplements tag ");
		}
		return SKIP_BODY;
	}
}

