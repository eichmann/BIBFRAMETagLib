package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkHasAbsorbedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkHasAbsorbedType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkHasAbsorbedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkHasAbsorbedIterator theWorkHasAbsorbedIterator = (WorkHasAbsorbedIterator)findAncestorWithClass(this, WorkHasAbsorbedIterator.class);
			pageContext.getOut().print(theWorkHasAbsorbedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

