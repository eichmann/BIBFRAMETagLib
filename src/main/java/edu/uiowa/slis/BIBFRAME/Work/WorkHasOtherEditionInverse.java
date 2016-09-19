package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkHasOtherEditionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkHasOtherEditionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkHasOtherEditionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkHasOtherEditionInverseIterator theWorkHasOtherEditionInverseIterator = (WorkHasOtherEditionInverseIterator)findAncestorWithClass(this, WorkHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theWorkHasOtherEditionInverseIterator.getHasOtherEditionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

