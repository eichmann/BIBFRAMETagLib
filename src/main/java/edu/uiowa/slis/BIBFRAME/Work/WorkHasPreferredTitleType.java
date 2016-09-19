package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkHasPreferredTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkHasPreferredTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkHasPreferredTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkHasPreferredTitleIterator theWorkHasPreferredTitleIterator = (WorkHasPreferredTitleIterator)findAncestorWithClass(this, WorkHasPreferredTitleIterator.class);
			pageContext.getOut().print(theWorkHasPreferredTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

