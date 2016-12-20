package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkBirthDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkBirthDate currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkBirthDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkBirthDateIterator theWork = (WorkBirthDateIterator)findAncestorWithClass(this, WorkBirthDateIterator.class);
			pageContext.getOut().print(theWork.getBirthDate());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for birthDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for birthDate tag ");
		}
		return SKIP_BODY;
	}
}

