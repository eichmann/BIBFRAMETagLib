package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkSeparatedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkSeparatedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkSeparatedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkSeparatedFromIterator theWorkSeparatedFromIterator = (WorkSeparatedFromIterator)findAncestorWithClass(this, WorkSeparatedFromIterator.class);
			pageContext.getOut().print(theWorkSeparatedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

