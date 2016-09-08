package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkIsPartOfIterator theWorkIsPartOfIterator = (WorkIsPartOfIterator)findAncestorWithClass(this, WorkIsPartOfIterator.class);
			pageContext.getOut().print(theWorkIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

