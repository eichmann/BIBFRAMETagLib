package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkHasOtherEditionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkHasOtherEditionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkHasOtherEditionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkHasOtherEditionInverseIterator theWorkHasOtherEditionInverseIterator = (WorkHasOtherEditionInverseIterator)findAncestorWithClass(this, WorkHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theWorkHasOtherEditionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

