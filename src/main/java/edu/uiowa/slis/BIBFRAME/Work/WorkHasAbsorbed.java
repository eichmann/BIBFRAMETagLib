package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkHasAbsorbed extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkHasAbsorbed currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkHasAbsorbed.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkHasAbsorbedIterator theWorkHasAbsorbedIterator = (WorkHasAbsorbedIterator)findAncestorWithClass(this, WorkHasAbsorbedIterator.class);
			pageContext.getOut().print(theWorkHasAbsorbedIterator.getHasAbsorbed());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

