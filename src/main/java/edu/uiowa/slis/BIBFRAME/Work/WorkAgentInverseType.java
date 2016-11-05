package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkAgentInverseIterator theWorkAgentInverseIterator = (WorkAgentInverseIterator)findAncestorWithClass(this, WorkAgentInverseIterator.class);
			pageContext.getOut().print(theWorkAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for agent tag ");
		}
		return SKIP_BODY;
	}
}

