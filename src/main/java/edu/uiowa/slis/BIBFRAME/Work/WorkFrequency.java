package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkFrequency extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkFrequency currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkFrequency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkFrequencyIterator theWork = (WorkFrequencyIterator)findAncestorWithClass(this, WorkFrequencyIterator.class);
			pageContext.getOut().print(theWork.getFrequency());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for frequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for frequency tag ");
		}
		return SKIP_BODY;
	}
}

