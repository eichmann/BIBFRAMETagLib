package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkIdentifiedByIterator theWorkIdentifiedByIterator = (WorkIdentifiedByIterator)findAncestorWithClass(this, WorkIdentifiedByIterator.class);
			pageContext.getOut().print(theWorkIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

