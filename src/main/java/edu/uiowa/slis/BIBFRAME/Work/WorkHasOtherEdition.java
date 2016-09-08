package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkHasOtherEdition extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkHasOtherEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkHasOtherEdition.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkHasOtherEditionIterator theWorkHasOtherEditionIterator = (WorkHasOtherEditionIterator)findAncestorWithClass(this, WorkHasOtherEditionIterator.class);
			pageContext.getOut().print(theWorkHasOtherEditionIterator.getHasOtherEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

