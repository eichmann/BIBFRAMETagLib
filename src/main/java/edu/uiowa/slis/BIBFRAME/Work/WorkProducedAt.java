package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkProducedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkProducedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkProducedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkProducedAtIterator theWorkProducedAtIterator = (WorkProducedAtIterator)findAncestorWithClass(this, WorkProducedAtIterator.class);
			pageContext.getOut().print(theWorkProducedAtIterator.getProducedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for producedAt tag ");
		}
		return SKIP_BODY;
	}
}

