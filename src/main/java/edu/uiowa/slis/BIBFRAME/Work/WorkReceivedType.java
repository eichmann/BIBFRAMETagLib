package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkReceivedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkReceivedType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkReceivedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkReceivedIterator theWorkReceivedIterator = (WorkReceivedIterator)findAncestorWithClass(this, WorkReceivedIterator.class);
			pageContext.getOut().print(theWorkReceivedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for received tag ");
		}
		return SKIP_BODY;
	}
}

