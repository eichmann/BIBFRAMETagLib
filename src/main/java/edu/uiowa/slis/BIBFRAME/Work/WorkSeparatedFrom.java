package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkSeparatedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkSeparatedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkSeparatedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkSeparatedFromIterator theWorkSeparatedFromIterator = (WorkSeparatedFromIterator)findAncestorWithClass(this, WorkSeparatedFromIterator.class);
			pageContext.getOut().print(theWorkSeparatedFromIterator.getSeparatedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for separatedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for separatedFrom tag ");
		}
		return SKIP_BODY;
	}
}

